package day7.exercise;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class CsvReader {
    public void run() throws FileNotFoundException {
        String filePath = System.getProperty("user.dir") + "/src/day7/exercise/product_sales_data.csv";
        try {
            readCsv(filePath);
        } catch (Exception e) {
            throw new FileNotFoundException("File not found: " + filePath);
        }
    }

    private void readCsv(String filePath) {
        Map<String, Integer> productSales = new HashMap<>();
        double totalSales = 0;
        int totalProductsSold = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine(); // skip title row
            String data = "";

            while ((data = br.readLine()) != null) {
                String[] values = data.split(",");
                String productName = values[0];
                int totalSold;
                double price;

                try {
                    totalSold = Integer.parseInt(values[1]);
                    price = Double.parseDouble(values[2]);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Invalid data format");
                }

                productSales.put(productName, productSales.getOrDefault(productName, 0) + totalSold);

                totalSales += totalSold * price;
                totalProductsSold += totalSold;
            }

            String mostSoldProduct = "";
            String leastSoldProduct = "";
            int mostSold = Integer.MIN_VALUE;
            int leastSold = Integer.MAX_VALUE;

            for (Map.Entry<String, Integer> entry : productSales.entrySet()) {
                String product = entry.getKey();
                int sold = entry.getValue();

                if (sold > mostSold) {
                    mostSold = sold;
                    mostSoldProduct = product;
                }

                if (sold < leastSold) {
                    leastSold = sold;
                    leastSoldProduct = product;
                }
            }
            DecimalFormat df = new DecimalFormat("#,###.00");
            System.out.println("Total sales: $" + df.format(totalSales));
            System.out.println("Total products sold: " + totalProductsSold);
            System.out.println("Most sold product: " + mostSoldProduct + " (" + mostSold + " units)");
            System.out.println("Least sold product: " + leastSoldProduct + " (" + leastSold + " units)");
        } catch (NumberFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

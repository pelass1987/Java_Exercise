package Main;

import java.util.*;
import java.util.HashMap;


public class EmployeeFactory {

    private static Employee employeeDeviceMap;
    private int actualEmployeeId = 0;
    private int actualEmployeeDeviceId = 0;

    public static List<String> employeesList = Arrays.asList("Adrian", "Marian", "Jan", "Dawid", "Andrzej",
            "Monika", "Gocha");

    public static List<String> deviceList = Arrays.asList("Dell_1128", "Dell2256", "Hp_wr45", "Apple",
            "Toshiba", "Samsung", "Lenovo");


    public Employee getEmployeeDeviceMap() {

        employeeDeviceMap = new Employee(getActualEmployeeId(), getRandomName(), getRandomSalary(), getNewKeyValue());
        return employeeDeviceMap;
    }

    private int getRandomSalary() {
        int min = 1000;
        int max = 3000;
        int randomSalary = (int) (Math.random() * (max - min) + min);
        return randomSalary;
    }

    private String getRandomName() {
        Random rand = new Random();
        String randomName = employeesList.get(rand.nextInt(employeesList.size() - 1));
        return randomName;
    }

    private String getRandomDevice() {
        Random rand1 = new Random();
        String randDevice = deviceList.get(rand1.nextInt(deviceList.size() - 1));
        return randDevice;
    }

    private String getRandomKey() {
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        String alphaNumeric = lowerAlphabet + numbers;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 6;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphaNumeric.length());
            char randomChar = alphaNumeric.charAt(index);
            sb.append(randomChar);
        }
        String randomKey = sb.toString();
        return randomKey;
    }

    private Map<String, String> getNewKeyValue() {
        HashMap<String, String> map = new HashMap<>();
        map.put(getRandomKey(), getRandomDevice());
        return map;
    }

    private int getActualEmployeeId() {
        return ++actualEmployeeId;
    }
}

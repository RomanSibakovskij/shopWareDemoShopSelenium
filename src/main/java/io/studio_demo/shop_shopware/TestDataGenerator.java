package io.studio_demo.shop_shopware;

import org.openqa.selenium.*;
import java.security.SecureRandom;
import java.util.*;

public class TestDataGenerator extends BasePage{

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    private static String storedFirstName;
    private static String storedLastName;
    private static String emailAddress;
    private static String password;

    public TestDataGenerator(WebDriver driver) {super(driver);}

    //first names array
    private static final String[] firstNames = {
            "Aiden", "Olivia", "Liam", "Emma", "Noah", "Ava", "Elijah", "Sophia", "Lucas", "Isabella",
            "Mason", "Mia", "Ethan", "Amelia", "James", "Harper", "Benjamin", "Evelyn", "Jack", "Abigail",
            "Henry", "Ella", "Alexander", "Avery", "Jackson", "Scarlett", "Sebastian", "Grace", "Owen", "Lily",
            "Matthew", "Chloe", "William", "Zoey", "Joseph", "Penelope", "Luke", "Hannah", "Daniel", "Aria",
            "Logan", "Ellie", "David", "Madison", "Samuel", "Nora", "John", "Riley", "Ryan", "Lillian",
            "Leo", "Paisley", "Nathan", "Aurora", "Isaac", "Addison", "Joshua", "Brooklyn", "Caleb", "Leah",
            "Hunter", "Savannah", "Andrew", "Sofia", "Connor", "Lucy", "Carter", "Victoria", "Eli", "Willow",
            "Wyatt", "Violet", "Dylan", "Zoe", "Grayson", "Stella", "Landon", "Hazel", "Gabriel", "Emilia",
            "Jayden", "Claire", "Anthony", "Bella", "Christian", "Maya", "Julian", "Elena", "Aaron", "Piper",
            "Dominic", "Ariana", "Adam", "Ruby", "Evan", "Madelyn", "Nicholas", "Alice", "Isaiah", "Skylar",
            "Thomas", "Eva", "Charles", "Everly", "Christopher", "Naomi", "Miles", "Quinn", "Zachary", "Aubrey",
            "Ezra", "Peyton", "Jeremiah", "Serenity", "Nathaniel", "Isla", "Robert", "Kennedy", "Jonathan", "Cora"
    };

    //last names array
    private static final String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "King", "Wright",
            "Scott", "Torres", "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Gonzalez",
            "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards",
            "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy",
            "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray",
            "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
            "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores",
            "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz",
            "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West",
            "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald", "Cruz", "Marshall"
    };

    // array of Illinois state cities
    private static final String[] ILLINOIS_CITIES = {
            "Chicago", "Aurora", "Naperville", "Joliet", "Rockford", "Springfield",
            "Elgin", "Peoria", "Champaign", "Waukegan", "Cicero", "Bloomington",
            "Arlington Heights", "Evanston", "Decatur", "Schaumburg", "Bolingbrook",
            "Palatine", "Skokie", "Des Plaines", "Orland Park", "Tinley Park",
            "Oak Lawn", "Berwyn", "Mount Prospect", "Normal", "Wheaton", "Hoffman Estates",
            "Oak Park", "Downers Grove", "Elmhurst", "Glenview", "DeKalb", "Lombard",
            "Moline", "Buffalo Grove", "Bartlett", "Urbana", "Crystal Lake", "Quincy",
            "Streamwood", "Carol Stream", "Romeoville", "Plainfield", "Hanover Park",
            "Carpentersville", "Wheeling", "Park Ridge", "Addison", "Calumet City"
    };

    //Illinois street types array
    private static final String[] STREET_TYPES = {"St.", "Ave.", "Blvd.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl."};

    //generate a random address with a given length for the street name
    public static String generateRandomAddress(int length) {
        int streetNumber = RANDOM.nextInt(9999) + 1; // street number between 1 and 9999
        String streetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String streetType = STREET_TYPES[RANDOM.nextInt(STREET_TYPES.length)];
        return streetNumber + " " + streetName + " " + streetType;
    }

    // cities rnd instance
    private static final Random rndIllinoisCities = new Random();

    // method to get a random city from the array
    public static String getRandomCity() {
        int index = rndIllinoisCities.nextInt(ILLINOIS_CITIES.length);
        return ILLINOIS_CITIES[index];
    }

    //random first name picker method
    public static String getRandomFirstName() {
        if (storedFirstName == null) {
            Random random = new Random();
            storedFirstName = firstNames[random.nextInt(firstNames.length)];
        }
        return storedFirstName;
    }
    //random last name picker method
    public static String getRandomLastName() {
        if (storedLastName == null) {
            Random random = new Random();
            storedLastName = firstNames[random.nextInt(firstNames.length)];
        }
        return storedLastName;
    }

    //generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //string generator methods
    private static String generateRandomNumberString(int length) {return generateRandomString(DIGITS, length);}

    private static String generateRandomSpecialString(int length) {return generateRandomString(SPECIAL, length);}

    //randomizer (for username) methods
    public static String generateRandomUsername(int length) {return generateRandomString(UPPER + LOWER, length);}

    //random email generator
    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@example.com";
    }
    //random password generator
    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    // generate random postal code for Illinois
    public static int getRandomPostalCode() {
        return 60000 + RANDOM.nextInt(30000);
    }
}

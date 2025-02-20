import java.util.*;

// Abstract class for Machine Learning Models
abstract class MLModel {
    abstract void processQuery(String query);
}

// ML Model Implementations
class RUMModel extends MLModel {
    void processQuery(String query) {
        System.out.println("Processing with RUMModel: " + query);
    }
}

class LSTMModel extends MLModel {
    void processQuery(String query) {
        System.out.println("Processing with LSTMModel: " + query);
    }
}

class TransformerModel extends MLModel {
    void processQuery(String query) {
        System.out.println("Processing with TransformerModel: " + query);
    }
}

// Subscription Class
class Subscription {
    String type;

    Subscription(String type) {
        this.type = type;
    }

    MLModel getModel() {
        if (type.equalsIgnoreCase("Pro")) {
            return new TransformerModel(); // Highest power model
        } else if (type.equalsIgnoreCase("Medium")) {
            return new LSTMModel();
        } else {
            return new RUMModel(); // Basic model
        }
    }
}

// Prompt Class
class Prompt {
    String query;
    String category;
    String subCategory;

    Prompt(String query, String category, String subCategory) {
        this.query = query;
        this.category = category;
        this.subCategory = subCategory;
    }
}

// SimpleBot Class
class SimpleBot {
    Subscription subscription;

    SimpleBot(Subscription subscription) {
        this.subscription = subscription;
    }

    void processQuery(Prompt prompt) {
        MLModel model = subscription.getModel();
        System.out.println("Category: " + prompt.category + ", Subcategory: " + prompt.subCategory);
        model.processQuery(prompt.query);
    }
}

// Main Class for Testing
public class ChatBotApp {
    public static void main(String[] args) {
        Subscription userSubscription = new Subscription("Medium"); // User with Medium subscription
        SimpleBot bot = new SimpleBot(userSubscription);

        // Sample prompts
        Prompt prompt1 = new Prompt("Explain AI Basics", "Educational", "Basic");
        Prompt prompt2 = new Prompt("Suggest Sci-Fi Books", "Entertainment", "Book");

        // Processing queries
        bot.processQuery(prompt1);
        bot.processQuery(prompt2);
    }
}

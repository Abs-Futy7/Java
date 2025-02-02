// Base class for Machine Learning Models
abstract class MLModel {
    abstract void processQuery(String query);
}

// Three ML Model Implementations
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
        switch (type) {
            case "Pro": return new TransformerModel();
            case "Medium": return new LSTMModel();
            default: return new RUMModel();
        }
    }
}

// SimpleBot Class
class SimpleBot {
    Subscription subscription;

    SimpleBot(Subscription subscription) {
        this.subscription = subscription;
    }

    void processQuery(String query) {
        MLModel model = subscription.getModel();
        model.processQuery(query);
    }
}

// Main Class for Testing
public class ChatBotApp {
    public static void main(String[] args) {
        Subscription userSubscription = new Subscription("Medium");
        SimpleBot bot = new SimpleBot(userSubscription);
        bot.processQuery("Tell me about AI.");
    }
}


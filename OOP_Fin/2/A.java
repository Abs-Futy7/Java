// Base class: Player
class Player {
    String name;
    String role;
    String team;

    Player(String name, String role, String team) {
        this.name = name;
        this.role = role;
        this.team = team;
    }

    void play() {
        System.out.println(name + " is playing as " + role);
    }
}

// Subclass: Striker
class Striker extends Player {
    Striker(String name, String team) {
        super(name, "Striker", team);
    }

    void attack() {
        System.out.println(name + " is attacking!");
    }
}

// Subclass: Midfielder
class Midfielder extends Player {
    Midfielder(String name, String team) {
        super(name, "Midfielder", team);
    }

    void assist() {
        System.out.println(name + " is assisting!");
    }
}

// Subclass: Defender
class Defender extends Player {
    Defender(String name, String team) {
        super(name, "Defender", team);
    }

    void block() {
        System.out.println(name + " is blocking the attack!");
    }
}

// Subclass: Goalkeeper
class Goalkeeper extends Player {
    Goalkeeper(String name, String team) {
        super(name, "Goalkeeper", team);
    }

    void saveGoal() {
        System.out.println(name + " is saving the goal!");
    }
}

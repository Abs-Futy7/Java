            ┌──────────────────────┐
            │   CustomPlayer       │
            │----------------------│
            │ - name: String       │
            │ - role: String       │
            │ - team: String       │
            │ - attributes[]       │
            │----------------------│
            │ + displayAttributes()│
            └──────────────────────┘


class CustomPlayer {
    String name;
    String role;
    String team;
    int[] attributes; // Kick Strength, Dribbling, Stamina, Goal Save

    CustomPlayer(String name, String role, String team, int kick, int dribble, int stamina, int save) {
        this.name = name;
        this.role = role;
        this.team = team;
        this.attributes = new int[]{kick, dribble, stamina, save};
    }

    void displayAttributes() {
        System.out.println(name + " (" + role + ") - Kick: " + attributes[0] +
                ", Dribbling: " + attributes[1] + ", Stamina: " + attributes[2] +
                ", Goal Save: " + attributes[3]);
    }
}

// Testing Custom Player Creation
public class PlayerCreation {
    public static void main(String[] args) {
        CustomPlayer player1 = new CustomPlayer("Leo", "Striker", "Red Team", 90, 85, 80, 20);
        CustomPlayer player2 = new CustomPlayer("Mike", "Goalkeeper", "Blue Team", 30, 40, 85, 95);

        player1.displayAttributes();
        player2.displayAttributes();
    }
}

****Output****
Leo (Striker) - Kick: 90, Dribbling: 85, Stamina: 80, Goal Save: 20
Mike (Goalkeeper) - Kick: 30, Dribbling: 40, Stamina: 85, Goal Save: 95

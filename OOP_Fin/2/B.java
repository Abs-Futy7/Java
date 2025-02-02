class MultiRolePlayer {
    String name;
    String team;
    String[] roles;
    int roleCount;

    MultiRolePlayer(String name, String team) {
        this.name = name;
        this.team = team;
        this.roles = new String[2]; // Allowing up to 2 roles
        this.roleCount = 0;
    }

    void addRole(String newRole) {
        if (roleCount == 2) {
            System.out.println("Error: " + name + " cannot have more than 2 roles.");
            return;
        }

        if (roles[0] != null && roles[0].equals("Goalkeeper")) {
            System.out.println("Error: Goalkeeper cannot have multiple roles.");
            return;
        }

        roles[roleCount] = newRole;
        roleCount++;
        System.out.println(name + " assigned role: " + newRole);
    }

    void showRoles() {
        System.out.print(name + " has roles: ");
        for (int i = 0; i < roleCount; i++) {
            System.out.print(roles[i] + " ");
        }
        System.out.println();
    }
}

// Testing Multiple Roles
public class B {
    public static void main(String[] args) {
        MultiRolePlayer p1 = new MultiRolePlayer("Alex", "Red Team");
        p1.addRole("Striker");
        p1.addRole("Midfielder");
        p1.showRoles();

        MultiRolePlayer p2 = new MultiRolePlayer("John", "Blue Team");
        p2.addRole("Goalkeeper");
        p2.addRole("Defender"); // Should show an error
    }
}

/* 
Alex assigned role: Striker
Alex assigned role: Midfielder
Alex has roles: Striker Midfielder
John assigned role: Goalkeeper
Error: Goalkeeper cannot have multiple roles.

*/
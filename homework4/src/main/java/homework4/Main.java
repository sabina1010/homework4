package homework4;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("cat",
                "Lilly",
                2,
                15,
                new String[]{"eating", "sleeping"});

        Human mother = new Human("Mary", "Hilston", 1990);
        Human father = new Human("Jason", "Hilston", 1985);

        Human child = new Human("Sabina","Hilston",
                2005,
                200,
                pet,
                father,mother, new String[][]{{"monday", "go to course"}});

        child.greetPet();
        child.describePet();
        pet.respond();
        pet.eat();

        System.out.println(child);
    }
}

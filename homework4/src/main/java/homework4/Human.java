package homework4;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human father;
    Human mother;
    String[][] schedule;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", father=" + father.name + " " + father.surname +
                ", mother=" + mother.name + " " + mother.surname +
                '}';
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human() {

    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickName);
    }

    public void describePet() {
        String slyLevel = "";
        if (pet.trickLevel > 50) {
            slyLevel = "very sly";
        } else {
            slyLevel = "almost not sly";
        }

        System.out.println("I have " + pet.species + ", he is " + pet.age + " years old, he is " + slyLevel);
    }
}

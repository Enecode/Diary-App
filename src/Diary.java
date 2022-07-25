import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {
        selectOptions();

    }

    static Scanner input = new Scanner(System.in);

    static ArrayList<String> write = new ArrayList<>();


    static ArrayList<String> continueWrite = new ArrayList<>();
    static ArrayList<Object> save = new ArrayList<>();

    public static void selectOptions() {

        System.out.printf("%s%n", """
                selection option 1 to 4
                press 1 to write
                press 2 to add
                press 3 to edit
                press 4 to delete""");

        int in = input.nextInt();
        if (in == 1) {
            write();
        }
        if (in == 2) {
            add();
        }
        if (in == 3) {
            edit();
        }
        if (in == 4) {
           delete();
        }
        if (in == 5) {
            save();
        }

    }

    private static void delete() {
        System.out.println("""
                Select from the options below to delete your files
                press 1 to delete your entire diary.
                press 2 to delete specific date""");
        int in = input.nextInt();
        if (in == 1) {
            System.out.println("No be so bros.");
        }

        if (in == 2) {
            System.out.println("Come back later");
        }
    }

    private static void add() {
        System.out.println("""
                    "Would you like to add to what you have written before?
                    enter 1 to continue writing.
                    enter 2 to write new
                    enter 3 to save""");
        int en = input.nextInt();
        switch (en) {
            case 1:
                continueWrite();
            case 2:
                write();
            case 3:
               save();
                break;
        }

    }

    private static void write() {
        Date date = new Date();

        System.out.println("""
                "Write how today was spent
                press enter key to save""");

        String stop = input.nextLine();
        write.add(String.valueOf(save.add(input.nextLine())));

        if (!(Objects.equals(stop, "Stop"))) {
            System.out.print("\nYour diary has been saved! \n");
            System.out.printf("%s\n \n", save.get(0));
            edit();
        }
    }

    private static void edit() {
            System.out.println("""
                    "Would you like to edit what you have written?
                    enter 1 to edit.
                    enter 2 to write new
                    enter 3 to save""");
            int en = input.nextInt();
            switch (en) {
                case 1:
                    System.out.println("edit your work");
                    continueWrite.add(input.nextLine());
                    if (continueWrite.add(input.nextLine())){
                        System.out.println("Your edit has been saved\n"+ continueWrite.get(1));
                        System.exit(1);
                    }
                case 2:
                    write();
                case 3:
                    save();
                    break;
            }
        }

    private static void save() {
        System.out.println("Your work has been saved");
    }

    private static void continueWrite() {
        System.out.println("""
                Continue writing
                press enter to save""");
        continueWrite.add(input.nextLine());
        if (continueWrite.add(input.nextLine())){
            System.out.println("Your writing has been saved");
            System.exit(1);
        }
    }
}


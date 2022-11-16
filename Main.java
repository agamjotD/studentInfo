public class Main
{
    public static void main(String[] args)
    {


        GoodStudent test1 = new GoodStudent("Alan", "Turing", 191254, 3.56, true);
        GoodStudent test2 = new GoodStudent("Florence ", "Nightin", 182110, 3.89, false);
        GoodStudent test3 = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);

        System.out.println(test1.toString());
        System.out.println("Full ID " + test1.createID());
        System.out.println("New GPA: " + test3.CSGPA());
        System.out.println("\n");

        System.out.println("ID: " + test2.getID());
        System.out.println("GPA: " + test2.getGPA());
        System.out.println(test2.getFirstName());
        System.out.println("Full ID: " + test2.createID());
        test2.setNewGPA(3.92);
        test2.setNewID(95366 );
        System.out.println("\n");

        System.out.println("First Name: " + test3.getFirstName());
        System.out.println("Are they a CS Student: " + test3.getStudent());
        System.out.println("ID: " + test3.createID());
        System.out.println("New GPA: " + test3.CSGPA());

    }

}


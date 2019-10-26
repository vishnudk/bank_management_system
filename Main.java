/*package gasd;

import java.io.*;

public class Main {

    public static void main(String a[]){
        //File f = new File("BankFile.txt");
        FileStore fs = new FileStore();
        //Bank B = new Bank("Vishnu", "DK", "D","K", "DK","20 May" ,99999) ;
      //  fs.StoreObj(B);
       // fs.displayObjects();
        //fs.search("BankFile.txt");
        Bank p1 = new Bank();
        //Bank p2 = new Bank("Vishn", "DK", "D","K", "DK","20 May" ,99999,"iopo");

        try {
            FileOutputStream f = new FileOutputStream(new File("BankFile.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(p1);
            //o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("BankFile.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
//while()
{
            // Read objects
            Bank pr1 = (Bank) oi.readObject();

while())
{
            String s = pr1.getFirstName();


            if (s.equalsIgnoreCase("Vish")) {

                String p = pr1.getPassword();
                if (p.equalsIgnoreCase("iop")) {
                    System.out.println("Yay");
                } else {
                    System.out.println("nooooooooo");
                }
            }

            System.out.println(pr1.toString());
            //System.out.println(pr2.toString());
        }
            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        }}*/

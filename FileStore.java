import java.io.*;

 class FileStore{
     void StoreObj(Bank B)
    {
        OutputStream ops= null;
        ObjectOutputStream objOutStr = null;
        try
        {
            ops = new FileOutputStream("BankFile.txt");

            objOutStr = new ObjectOutputStream(ops);
            objOutStr.writeObject(B);
            objOutStr.flush();
        }

        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }


        catch(IOException e)
        {
            e.printStackTrace();
        }

        finally{
            try
            {
                if(objOutStr!=null)
                    objOutStr.close();

            }

            catch(Exception e)
            {}
        }

    }

    public void displayObjects(){

        InputStream fileIs = null;
        ObjectInputStream objIs = null;

        try
        {
            fileIs = new FileInputStream("BankFile.txt");
            objIs = new ObjectInputStream(fileIs);
            Bank B = (Bank) objIs.readObject();

            System.out.println("First Name: " + B.getFirstName());
            System.out.println("Last Name: " + B.getLastName());
            System.out.println("Father's Name: " + B.getFatherName());
            System.out.println("Mother's Name: " + B.getMotherName());
            System.out.println("House Name: " + B.getHouseName());
            System.out.println("DOB: " + B.getDob());
            System.out.println("Phone Number: " + B.getPhno());

        }


        catch (Exception e) {
            e.printStackTrace();


        } finally {
            try {
                if(objIs != null) objIs.close();
            } catch (Exception ex){

            }
        }

    }
}

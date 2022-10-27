import java.io.FileWriter;

public class Write {

    public void WriteData(People people) throws Exception {
        FileWriter w = new FileWriter(people.Get_Surname(), true);
        w.write(people.GetFullName()+"\n");
        w.flush();
        w.close();
    }
}

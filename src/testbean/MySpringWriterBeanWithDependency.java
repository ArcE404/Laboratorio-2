package testbean;
import org.springframework.beans.factory.annotation.Autowired;
import writer.Writer;

public class MySpringWriterBeanWithDependency {
    private Writer cambio;
    @Autowired
    public void setCambio(Writer pWriter){
        ///System.out.println("Writer is set");
        this.cambio = pWriter;
    }
    public void run(){
        String s = "Sample string";
        cambio.write(s);
    }

}

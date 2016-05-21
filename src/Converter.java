import javax.faces.bean.ManagedBean;
import java.util.Date;

/**
 * Created by hasanburakkutbay on 21.05.2016.
 */
@ManagedBean
public class Converter {
    Date tarihsaat;

    public Date getTarihsaat() {
        return new Date();
    }

    public void setTarihsaat(Date tarihsaat) {
        this.tarihsaat = tarihsaat;
    }
}


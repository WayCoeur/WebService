package infres.ws.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@RestController
@RequestMapping("/api/v1/vol")
public class VolController {


    @GetMapping("/{id}")
    public String getVol(@PathVariable Long id) throws JAXBException {
        Vol vol = new Vol();
        JAXBContext context = JAXBContext.newInstance(Vol.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        mar.marshal(vol, sw);
        return sw.toString();
    }
}
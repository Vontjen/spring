package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello";
    }
   /* ZEEEEER oude omslachtige methode voor html pagina's, letterlijk alle configuraties zelf gedaan, Springboot voorziet methoden om dit voor u te doen
   String home() {
        try {
            BufferedReader fr = new BufferedReader(new FileReader("remember.html"));
            String all ="";
            String line = fr.readLine();
            while (line!=null){
                all += line;

                line = fr.readLine();
            }
            return all;
        } catch (IOException e) {
            e.printStackTrace();
            return "fout";
        }
    }
*/
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
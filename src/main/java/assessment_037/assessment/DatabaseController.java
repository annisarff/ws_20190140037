/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment_037.assessment;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author annis
 */
@Controller
public class DatabaseController {
    
    @CrossOrigin
    @RequestMapping(value = "/datamahasiswajson", produces = { MediaType.APPLICATION_JSON_VALUE,//MediaType.Text_XML_VALUE
    })
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswa(){
        
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch(Exception e){}
        return datamahasiswa;
    }
    
    @RequestMapping("/datamahasiswaxml")
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswaxml(){
        
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch(Exception e){}
        return datamahasiswa;
    }
}

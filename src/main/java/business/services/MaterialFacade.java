package business.services;

import business.persistence.Database;
import business.persistence.MaterialMapper;

import java.util.ArrayList;
import java.util.List;

public class MaterialFacade {
    MaterialMapper materialMapper;

    public MaterialFacade(Database db) {
        this.materialMapper = new MaterialMapper(db);

    }
    public List<Integer> getAllLength(){
        List<Integer> lengths = new ArrayList<>();
        for(int i=330;i<=780;i+=30) {
            lengths.add(i);
        }
        return lengths;
    }

    public List<Integer> getAllWidths(){
        List<Integer> widths = new ArrayList<>();
        for(int i=260;i<=600;i+=30) {
            widths.add(i);
        }
        return widths;
    }


    public List getAllMaterial(){
        List<String> materialList = new ArrayList<String>();
        //List<Material> materialList = new ArrayList<String>();
        //TODO: Tag strengen og lav den til et objekt
        //TODO: Material klasse og materialtabel skal passe sammen ca. 1:1
        //Stolper, spærtræ
        //97x97_mm_trykimp_Stolpe_300_11_stk_Stolper_nedgraves_90_cm_i_jord
        //97x97-trykimp_Stolpe-300-Stolper-nedgraves_90_cm_i_jord
        //45x19-spærtræ_ubh-600-Rem-Remme_i_sider_sadles_ned_i_stolper
        //45x195-spærtræ_ubh-600-Spær-Monteres_på_rem
        String pole = "97x97-trykimp_Stolpe-300-Stolper-nedgraves_90_cm_i_jord";
        String beam = "45x19-spærtræ_ubh-600-Rem-Remme_i_sider_sadles_ned_i_stolper";
        String rafters = "45x195-spærtræ_ubh-600-Spær-Monteres_på_rem";

        materialList.add(pole);
        materialList.add(beam);
        materialList.add(rafters);

        return materialList;
    }

}

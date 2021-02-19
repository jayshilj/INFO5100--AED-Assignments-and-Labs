/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author welcome
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> vitalSignHistory;
    
    public AirlinerDirectory()
    {
        vitalSignHistory = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Airliner> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    
    public Airliner addVitals()
    {
        Airliner vs = new Airliner();
        vitalSignHistory.add(vs);
        return vs;
        
    }
   
    public void deleteVitals(Airliner v)
    {
        vitalSignHistory.remove(v);
    }

//    public List<Airliner> getAbnormalList(double maxBP,double minBP){
//        List<Airliner> abnList = new ArrayList<>();
//        for(Airliner vs : vitalSignHistory){
//            if(vs.getBloodPressure()>maxBP || vs.getBloodPressure()<minBP){
//                abnList.add(vs);
//            }
//        }
//        return abnList;
//    }
    
    
}

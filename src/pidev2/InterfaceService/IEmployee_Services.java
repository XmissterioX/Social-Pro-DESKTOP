/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev2.InterfaceService;

import java.util.List;
import pidev2.Entities.Employee;

/**
 *
 * @author LordGoats
 */
public interface IEmployee_Services {
     public void Ajout(Employee O);
    public void Modif(Employee O);
    public void Suppression(Employee O);
    public List<Employee> Affichage();
    public Employee getById(Integer id);
    
}

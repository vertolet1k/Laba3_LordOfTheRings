/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
/**
 *
 * @author vika
 */
public class DolGuldurGearFactory implements OrcGearFactory {
    @Override
    public String createWeapon() {
        return "Копье";
    }

    @Override
    public String createArmor() {
        return "Кольчуга";
    }

    @Override
    public String createBanner() {
        return "Знамя с пауком";
    }
} 
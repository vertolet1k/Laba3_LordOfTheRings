/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
/**
 *
 * @author vika
 */
public class MordorGearFactory implements OrcGearFactory {
    @Override
    public String createWeapon() {
        return "Тяжелый меч";
    }

    @Override
    public String createArmor() {
        return "Стальная броня";
    }

    @Override
    public String createBanner() {
        return "Знамя с Красным Оком";
    }
} 
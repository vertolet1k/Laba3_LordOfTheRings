package builder;

import model.Orc;
import com.github.javafaker.Faker;
import java.util.Random;

public abstract class OrcBuilder {
    protected Orc orc;
    protected Random random = new Random();
    protected Faker faker = new Faker();

    public OrcBuilder() {
        orc = new Orc();
    }

    public abstract OrcBuilder buildName();
    public abstract OrcBuilder buildWeapon();
    public abstract OrcBuilder buildArmor();
    public abstract OrcBuilder buildBanner();
    public abstract OrcBuilder buildStats();

    public Orc getResult() {
        Orc result = orc;
        orc = new Orc();
        return result;
    }
} 
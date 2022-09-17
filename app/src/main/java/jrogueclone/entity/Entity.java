package jrogueclone.entity;

import jrogueclone.game.Vector2D;
import jrogueclone.game.Weapon;

public abstract class Entity {
    public Entity(char entityCharecter) {

        this.m_EntityCharacter = entityCharecter;
        handleEntitySpawn();
    }

    public Entity(char entityCharecter, Vector2D entityPosition) {

        this.m_EntityCharacter = entityCharecter;
        this.m_EntityPosition = entityPosition;
        handleEntitySpawn();
    }

    public class HealthController {
        public void setHealth(int healthPoints) {
            this.m_HealthPoints = healthPoints;
        }

        public int getHealth() {
            return this.m_HealthPoints;
        }

        public void deductHealth(int healthDeduction) {
            this.m_HealthPoints -= healthDeduction;
        }

        private int m_HealthPoints = 0;
    }

    public abstract void handleEntitySpawn();

    public HealthController getHealthController() {
        return this.m_HealthController;
    }

    public Vector2D getPosition() {
        return this.m_EntityPosition;
    }

    public char getEntityCharacter() {
        return this.m_EntityCharacter;
    }

    public Weapon[] getAvailableWeapons() {
        return this.m_AvailableWeapons;
    }

    private final char m_EntityCharacter;
    protected int m_TilesPerSecond;
    private Vector2D m_EntityPosition = new Vector2D();
    private HealthController m_HealthController = new HealthController();
    protected Weapon[] m_AvailableWeapons;
}

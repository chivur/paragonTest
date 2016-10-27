package com.example.razvan.paragontest;

/**
 * Created by Razvan on 3/27/2016.
 */
public class Hero {

    private String name;
    private int iconID;
    private String role;

    private String affinity[];
    private float maxHealth;
    private float healthRegen;
    private float energyArmor;
    private float physicalArmor;
    private float attackSpeedRating;
    private float critBonus;
    private float energyPen;
    private float physicalPen;
    private float moveSpeed;
    private float visionRadius;
    private float physicalDamage;
    private float energyDamage;
    private float lifesteal;
    private float cooldownReduction;
    private float critChance;





    public Hero(String name, int iconID,String role){
        this.name = name;
        this.iconID = iconID;
        this.role = role;

        this.physicalDamage=0;
        this.energyDamage=0;
        this.critChance=0;
        this.energyPen=0;
        this.physicalPen=0;
        this.lifesteal=0;
        this.cooldownReduction=0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconID() {
        return iconID;
    }

    public void setIconID(int iconID) {
        this.iconID = iconID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getAffinity() {
        return affinity;
    }

    public void setAffinity(String affinity) {
        this.affinity = affinity.split(" ");
    }

    public float getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(float maxHealth) {
        this.maxHealth = maxHealth;
    }

    public float getHealthRegen() {
        return healthRegen;
    }

    public void setHealthRegen(float healthRegen) {
        this.healthRegen = healthRegen;
    }

    public float getEnergyArmor() {
        return energyArmor;
    }

    public void setEnergyArmor(float energyArmor) {
        this.energyArmor = energyArmor;
    }

    public float getPhysicalArmor() {
        return physicalArmor;
    }

    public void setPhysicalArmor(float physicalArmor) {
        this.physicalArmor = physicalArmor;
    }

    public float getAttackSpeedRating() {
        return attackSpeedRating;
    }

    public void setAttackSpeedRating(float attackSpeedRating) {
        this.attackSpeedRating = attackSpeedRating;
    }

    public float getCritBonus() {
        return critBonus;
    }

    public void setCritBonus(float critBonus) {
        this.critBonus = critBonus;
    }

    public float getEnergyPen() {
        return energyPen;
    }

    public void setEnergyPen(float energyPen) {
        this.energyPen = energyPen;
    }

    public float getPhysicalPen() {
        return physicalPen;
    }

    public void setPhysicalPen(float physicalPen) {
        this.physicalPen = physicalPen;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public float getVisionRadius() {
        return visionRadius;
    }

    public void setVisionRadius(float visionRadius) {
        this.visionRadius = visionRadius;
    }

    public float getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(float physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public float getEnergyDamage() {
        return energyDamage;
    }

    public void setEnergyDamage(float energyDamage) {
        this.energyDamage = energyDamage;
    }

    public float getLifesteal() {
        return lifesteal;
    }

    public void setLifesteal(float lifesteal) {
        this.lifesteal = lifesteal;
    }

    public float getCooldownReduction() {
        return cooldownReduction;
    }

    public void setCooldownReduction(float cooldownReduction) {
        this.cooldownReduction = cooldownReduction;
    }

    public float getCritChance() {
        return critChance;
    }

    public void setCritChance(float critChance) {
        this.critChance = critChance;
    }
}




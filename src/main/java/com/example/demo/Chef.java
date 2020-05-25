package com.example.demo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Chef {
    @NotEmpty
    private String chefName;
    @NotEmpty
    private String foodType;
    @NotEmpty
    @Size(min = 5)
    private String ingredients;

    public Chef(){
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}

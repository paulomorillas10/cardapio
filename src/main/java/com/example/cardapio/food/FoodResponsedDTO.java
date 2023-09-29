package com.example.cardapio.food;

public record FoodResponsedDTO(Long id, String title, String image, Integer price){
    public FoodResponsedDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}

package com.example.breakfast_proj;

public class FoodItem {

        private String name;
        private int imageResource;
        private String kcal;
        private String weight;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getImageResource() {
                return imageResource;
        }

        public void setImageResource(int imageResource) {
                this.imageResource = imageResource;
        }

        public String getKcal() {
                return kcal;
        }

        public void setKcal(String kcal) {
                this.kcal = kcal;
        }

        public String getWeight() {
                return weight;
        }

        public void setWeight(String weight) {
                this.weight = weight;
        }

        public String getCarbohydrate() {
                return carbohydrate;
        }

        public void setCarbohydrate(String carbohydrate) {
                this.carbohydrate = carbohydrate;
        }

        public String getFat() {
                return fat;
        }

        public void setFat(String fat) {
                this.fat = fat;
        }

        public String getProtein() {
                return protein;
        }

        public void setProtein(String protein) {
                this.protein = protein;
        }

        public String getFiber() {
                return fiber;
        }

        public void setFiber(String fiber) {
                this.fiber = fiber;
        }

        public String getRanking() {
                return ranking;
        }

        public void setRanking(String ranking) {
                this.ranking = ranking;
        }

        private String carbohydrate;
        private String fat;
        private String protein;
        private String fiber;
        private String ranking;
 }



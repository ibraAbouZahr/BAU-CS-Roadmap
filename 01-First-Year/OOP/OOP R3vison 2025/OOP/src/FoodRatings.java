import java.util.*;

class FoodRatings {
    private Map<String, List<Food>> cuisineMap; // Map to store food items by cuisine
    
    // Inner class to store food details
    private class Food {
        String name;
        int rating;

        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }

        // To handle the lexicographical comparison when ratings are equal
        public String toString() {
            return this.name;
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        cuisineMap = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], ratings[i]);
            cuisineMap.putIfAbsent(cuisines[i], new ArrayList<>());
            cuisineMap.get(cuisines[i]).add(food);
        }
    }
    
    public void changeRating(String food, int newRating) {
        for (List<Food> foodList : cuisineMap.values()) {
            for (Food f : foodList) {
                if (f.name.equals(food)) {
                    f.rating = newRating;
                    return;
                }
            }
        }
    }
    
    public String highestRated(String cuisine) {
        List<Food> foodList = cuisineMap.get(cuisine);
        if (foodList == null) return "";
        
        Food highest = null;
        for (Food food : foodList) {
            if (highest == null || food.rating > highest.rating || 
                (food.rating == highest.rating && food.name.compareTo(highest.name) < 0)) {
                highest = food;
            }
        }
        return highest.name;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */

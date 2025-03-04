package item_item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MertErgun on 25.10.2015.
 */
public class User {
    public Map<Integer,Float> ratings;
    public Map<Integer,SimilarityPair> estimated_ratings;
    public List<Integer> old_results;
    public int user_id;
    public float avg_rating;
    public User(int i) {
        user_id = i;
        ratings = new HashMap<Integer, Float>();
        estimated_ratings = new HashMap<Integer, SimilarityPair>();
        old_results = new ArrayList<Integer>();
    }

}

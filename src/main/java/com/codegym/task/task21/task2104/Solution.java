package com.codegym.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/*
Equals and HashCode
In the Solution class, fix the equals/hashCode methods according to the implementation rules for these methods (use your favorite search engine to check the details).
Both the first and last strings should be involved in the equals method's comparison and the calculation of the hashcode.
The main method is not tested.

Requirements:
•	The hashcodes of identical objects must be equal.
•	The equals method should check whether the passed object is equal to the current object (comparison using ==).
•	The equals method should check whether the passed object is a Solution object.
•	The equals method must return true if the first and last fields are equal to the passed object and the current one (don't forget that they might be null).
•	You must ensure that the HashSet of	Solution elements behaves correctly.
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;

        Solution solution = (Solution) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

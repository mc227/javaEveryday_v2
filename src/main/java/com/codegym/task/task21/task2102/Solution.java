package com.codegym.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
Compare modifiers

Implement the logic of the isModifierSet method, which checks whether the passed allModifiers argument has a specific modifier set (specificModifier).

P.S. Before implementing the task, take a look at the Modifier class and the implementation of isPublic, isStatic, and so on.

Requirements:
•	The isModifierSet method must be static.
•	The isModifierSet method should return a boolean.
•	The isModifierSet method must have two int parameters.
•	The isModifierSet method must return the correct value according to the task conditions (true, if the specified modifier is set in allModifiers; otherwise, false).
*/

public class Solution {
    public static void main(String[] args) {
        int classModifiers = Solution.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true

    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return (allModifiers & specificModifier) != 0;
    }

    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}

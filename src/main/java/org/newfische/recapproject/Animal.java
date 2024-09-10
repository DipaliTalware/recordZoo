package org.newfische.recapproject;

import java.util.HashMap;
import java.util.Map;

public record Animal(int id, String name, int age, Owner owner, Species species) {

}

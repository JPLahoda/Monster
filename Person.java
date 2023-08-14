package edu.temple.datastructures.dyee.oop.assignment.episode1;

public class Person extends Creature {

    public Person(Model model, int row, int column) {
        super(model, row, column);
    }
    
    int decideMove() { // This code idea was inspired by Tyler Baker from our class. I did not see his code.
        // The code makes the Person move to the Monster's perfect blind spot when it gets seen.

        for (int i = Model.MIN_DIRECTION; i <= Model.MAX_DIRECTION; i++) {
            if (look(i) == Model.MONSTER) {
                if (i == Model.N) {
                    if (canMove(Model.SE)) {
                        return Model.SE;
                    } else if (canMove(Model.SW)) {
                        return Model.SW;
                    } else if (canMove(Model.E)) {
                        return Model.E;
                    } else if (canMove(Model.W)) {
                        return Model.W;
                    } else if (canMove(Model.NW)) {
                        return Model.NW;
                    } else /*if (canMove(Model.NE))*/ {
                        return Model.NE;
                    }

                } else if (i == Model.NE) {
                    if (canMove(Model.S)) {
                        return Model.S;
                    } else if (canMove(Model.W)) {
                        return Model.W;
                    } else if (canMove(Model.SE)) {
                        return Model.SE;
                    } else if (canMove(Model.NW)) {
                        return Model.NW;
                    } else if (canMove(Model.N)) {
                        return Model.N;
                    } else /*if (canMove(Model.E))*/ {
                        return Model.E;
                    }

                } else if (i == Model.E) {
                    if (canMove(Model.SW)) {
                        return Model.SW;
                    } else if (canMove(Model.NW)) {
                        return Model.NW;
                    } else if (canMove(Model.N)) {
                        return Model.N;
                    } else if (canMove(Model.S)) {
                        return Model.S;
                    } else if (canMove(Model.NE)) {
                        return Model.NE;
                    } else /*if (canMove(Model.SE))*/ {
                        return Model.SE;
                    }

                } else if (i == Model.SE) {
                    if (canMove(Model.W)) {
                        return Model.W;
                    } else if (canMove(Model.N)) {
                        return Model.N;
                    } else if (canMove(Model.NE)) {
                        return Model.NE;
                    } else if (canMove(Model.SW)) {
                        return Model.SW;
                    } else if (canMove(Model.E)) {
                        return Model.E;
                    } else /*if (canMove(Model.S))*/ {
                        return Model.S;
                    }

                } else if (i == Model.S) {
                    if (canMove(Model.NW)) {
                        return Model.NW;
                    } else if (canMove(Model.NE)) {
                        return Model.NE;
                    } else if (canMove(Model.E)) {
                        return Model.E;
                    } else if (canMove(Model.W)) {
                        return Model.W;
                    } else if (canMove(Model.SE)) {
                        return Model.SE;
                    } else /*if (canMove(Model.SW))*/ {
                        return Model.SW;
                    }

                } else if (i == Model.SW) {
                    if (canMove(Model.N)) {
                        return Model.N;
                    } else if (canMove(Model.E)) {
                        return Model.E;
                    } else if (canMove(Model.NW)) {
                        return Model.NE;
                    } else if (canMove(Model.SE)) {
                        return Model.SW;
                    } else if (canMove(Model.S)) {
                        return Model.S;
                    } else /*if (canMove(Model.W))*/ {
                        return Model.W;
                    }

                } else if (i == Model.W) {
                    if (canMove(Model.NE)) {
                        return Model.NE;
                    } else if (canMove(Model.SE)) {
                        return Model.SE;
                    } else if (canMove(Model.N)) {
                        return Model.N;
                    } else if (canMove(Model.S)) {
                        return Model.S;
                    } else if (canMove(Model.SW)) {
                        return Model.SW;
                    } else /*if (canMove(Model.NW))*/ {
                        return Model.NW;
                    }

                } else if (i == Model.NW) {
                    if (canMove(Model.E)) {
                        return Model.E;
                    } else if (canMove(Model.S)) {
                        return Model.S;
                    } else if (canMove(Model.NE)) {
                        return Model.NE;
                    } else if (canMove(Model.SW)) {
                        return Model.SW;
                    } else if (canMove(Model.W)) {
                        return Model.W;
                    } else/* if (canMove(Model.N))*/ {
                        return Model.N;
                    }

                } else {
                    return Model.STAY;
                }

            }

        }
        return Model.STAY;
    }

}



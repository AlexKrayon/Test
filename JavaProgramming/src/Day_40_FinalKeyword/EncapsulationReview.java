package Day_40_FinalKeyword;

import Day_38_InheritanceContinueTwo.Shapes.Circle;
import Day_38_InheritanceContinueTwo.Shapes.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;


    public Circle getCircle(){
        return circle;
    }
    public Square getSquare(){
        return square;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }


}

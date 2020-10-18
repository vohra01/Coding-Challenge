package kunal.Main;


import java.util.Arrays;

//import static org.junit.Assert.assertThat;

/**
 * Created by Kunal Vohra on 01/10/2020.
 */

class FindIntersactionPoints {
/*
    public static int[] findInteraction(int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);

        int maxLength = left.length;
        int defaultEntry = 1, maxInteractions = 1, axisPoint = left[0];
        int leftIndexer = 1, rightIndexer = 0;   //iterators

        // process all events in sorted order
        while (leftIndexer < maxLength && rightIndexer < maxLength) {
            // For left event increment default count of interactions
            if (left[leftIndexer] <= right[rightIndexer]) {
                defaultEntry++;
                // Update maxInteractions if needed
                if (defaultEntry > maxInteractions) {
                    maxInteractions = defaultEntry;
                    axisPoint = left[leftIndexer];
                }
                leftIndexer++; //increment index of left array
            } else {
                // If event is right, decrement defaylt count
                defaultEntry--;
                rightIndexer++;
            }
        }

        //Uncomment to see readable output
        //System.out.println("Maximum Number of Interactions = " + maxInteractions + " at Axis Point " + axisPoint);
        return new int[]{maxInteractions, axisPoint};
    }

    // Driver program to test above function 
    public static void main(String[] args) {
        int[] leftl = {1, 2, 10, 5, 5};
        int[] right = {4, 5, 12, 9, 12};
        //Assert Interactions = 3, Point 5

        int[] leftl1 = {1, 2, 4, 3, 5};
        int[] right1 = {3, 7, 6, 10, 11};
        //Assert Interactions = 4, Point 5

        int[] leftl2 = {1, 2, 3, 5};
        int[] right2 = {6, 8, 10, 8};
        //Assert Interactions = 4, Point 5

        int[] leftl3 = {1, 4};
        int[] right3 = {2, 6};
        //Assert Interactions = 1, Point 1 (Mean No Interaction)

        int[] leftl4 = {1, 2};
        int[] right4 = {4, 6};
        //Assert Interactions = 2, Point 2

        System.out.println(Arrays.toString(findInteraction(leftl, right)));
        System.out.println(Arrays.toString(findInteraction(leftl1, right1)));
        System.out.println(Arrays.toString(findInteraction(leftl2, right2)));
        System.out.println(Arrays.toString(findInteraction(leftl3, right3)));
        System.out.println(Arrays.toString(findInteraction(leftl4, right4)));
    }
}


class FindIntersactionPointsTest {

    @Test
    public void should_find_interaction_point_and_axis_point_when_axis_overlaps() {
        //GIVEN
        FindIntersactionPoints findIntersactionPoints = new FindIntersactionPoints();   //Initialised but not used as its a static method here in main class
        int[] left = {1, 2, 4, 3, 5};
        int[] right = {3, 7, 6, 10, 11};

        //WHEN
        int[] actual = FindIntersactionPoints.findInteraction(left, right);

        //THEN
        assertThat(actual[0]).isEqualTo(4);
        assertThat(actual[1]).isEqualTo(5);
        //assertEquals can also be used here
    }


    @Test
    public void should_find_default_interaction_point_and_axis_point_when_axis_does_not_overlaps() {
        //GIVEN
        FindIntersactionPoints findIntersactionPoints = new FindIntersactionPoints();
        int[] leftl = {1, 4};
        int[] right = {2, 6};

        //WHEN
        int[] actual = FindIntersactionPoints.findInteraction(left, right);

        //THEN
        assertThat(actual[0]).isEqualTo(1);
        assertThat(actual[1]).isEqualTo(1);
        //assertEquals can also be used here

    }*/
}

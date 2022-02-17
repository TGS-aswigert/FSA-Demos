
        public class Room_end {
            private final int squareFootage;
            private String wallColor;

            public Room_end(int squareFootage, String wallColor) {
                this.squareFootage = squareFootage;
                this.wallColor = wallColor;
            }

            public int getSquareFootage() {
                return squareFootage;
            }

            public String getWallColor() {
                return wallColor;
            }

            public void setWallColor(String wallColor) {
                this.wallColor = wallColor;
            }
        }



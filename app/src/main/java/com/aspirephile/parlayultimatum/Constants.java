package com.aspirephile.parlayultimatum;

public class Constants {
    public static final class errorResults {
        public static final String pointNotFound = "POINT_NOT_FOUND";
        public static final String badPID = "BAD_PID";
        public static final String badIntent = "BAD_INTENT";
    }


    public static class extras {

        public static final String PID = "PID";
        public static final String errorResult = "errorResult";
    }

    public static final class preferences {

        public static final class pointCreator {

            public static final int titleMin = 15;
            public static final int titleMax = 60;
            public static final int descriptionMin = 20;
            public static final int descriptionMax = 4000;
        }
    }

    public static final class codes {

        public static final class result {

            public static final int point_viewer = 1131;
            public static final int point_creator = 1141;
        }
    }

    public static class tags {

        public static final String pointListFragment = "pointListFragment";
        public static final String pointViewerFragment = "pointViewerFragment";
    }
}

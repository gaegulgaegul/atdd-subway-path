package atdd;

import atdd.station.model.dto.CreateLineRequestView;
import atdd.station.model.entity.Edge;
import atdd.station.model.entity.Line;
import atdd.station.model.entity.Station;

import java.time.LocalTime;

public class TestConstant {
    public static final long STATION_ID_1 = 1l;
    public static final long STATION_ID_2 = 2l;
    public static final long STATION_ID_3 = 3l;
    public static final long STATION_ID_4 = 4l;
    public static final long STATION_ID_5 = 5l;
    public static final long STATION_ID_6 = 6l;
    public static final long STATION_ID_7 = 7l;
    public static final long STATION_ID_8 = 8l;
    public static final long STATION_ID_9 = 9l;
    public static final long STATION_ID_10 = 10l;

    public static final String STATION_NAME = "강남역";
    public static final String STATION_NAME_2 = "역삼역";
    public static final String STATION_NAME_3 = "선릉역";
    public static final String STATION_NAME_4 = "삼성역";
    public static final String STATION_NAME_5 = "종합운동장역";

    public static final String STATION_NAME_6 = "양재역";
    public static final String STATION_NAME_7 = "양재시민의숲역";
    public static final String STATION_NAME_8 = "청계산입구역";
    public static final String STATION_NAME_9 = "판교역";
    public static final String STATION_NAME_10 = "정자역";

    public static final String STATION_NAME_11 = "고속버스터미널역";
    public static final String STATION_NAME_12 = "교대역";
    public static final String STATION_NAME_13 = "남부터미널역";
    public static final String STATION_NAME_14 = "매봉역";
    public static final String STATION_NAME_15 = "도곡역";
    public static final String STATION_NAME_16 = "대치역";

    public static final String STATION_NAME_17 = "수서역";
    public static final String STATION_NAME_18 = "대모산입구역";
    public static final String STATION_NAME_19 = "개포동역";
    public static final String STATION_NAME_20 = "구룡역";
    public static final String STATION_NAME_21 = "한티역";
    public static final String STATION_NAME_22 = "산정릉역";

    public static final String LINE_NAME_1 = "2호선";
    public static final String LINE_NAME_2 = "신분당선";
    public static final String LINE_NAME_3 = "3호선";
    public static final String LINE_NAME_4 = "분당선";

    public static final CreateLineRequestView CREATE_LINE_REQUEST_VIEW_1 = CreateLineRequestView.builder().name(LINE_NAME_1).startTime(LocalTime.of(5, 0)).endTime(LocalTime.of(23, 50)).intervalTime(10).build();
    public static final CreateLineRequestView CREATE_LINE_REQUEST_VIEW_2 = CreateLineRequestView.builder().name(LINE_NAME_2).startTime(LocalTime.of(0, 0)).endTime(LocalTime.of(23, 30)).intervalTime(30).build();
    public static final CreateLineRequestView CREATE_LINE_REQUEST_VIEW_3 = CreateLineRequestView.builder().name(LINE_NAME_3).startTime(LocalTime.of(0, 0)).endTime(LocalTime.of(23, 30)).intervalTime(30).build();
    public static final CreateLineRequestView CREATE_LINE_REQUEST_VIEW_4 = CreateLineRequestView.builder().name(LINE_NAME_4).startTime(LocalTime.of(0, 0)).endTime(LocalTime.of(23, 30)).intervalTime(30).build();

    public static final Line LINE_1 = Line.builder().name(STATION_NAME).startTime(LocalTime.of(5, 0)).endTime(LocalTime.of(23, 50)).intervalTime(10).build();

    public static final Edge EDGE_1 = new Edge(STATION_ID_1, STATION_ID_2, 10, 10);
    public static final Edge EDGE_2 = new Edge(STATION_ID_2, STATION_ID_3, 10, 10);
    public static final Edge EDGE_3 = new Edge(STATION_ID_3, STATION_ID_5, 10, 10);

    public static final Edge NEW_EDGE_1 = new Edge(STATION_ID_3, STATION_ID_4, 10, 10);

    // edge delete test
    public static final Station STATION_1 = Station.builder().name(STATION_NAME).build();

    public static final Edge EDGE_50 = new Edge(STATION_ID_1, STATION_ID_2, 10, 10);
    public static final Edge EDGE_51 = new Edge(STATION_ID_2, STATION_ID_3, 10, 10);
    public static final Edge EDGE_52 = new Edge(STATION_ID_3, STATION_ID_4, 10, 10);
    public static final Edge EDGE_53 = new Edge(STATION_ID_4, STATION_ID_5, 10, 10);
    public static final Edge EDGE_54 = new Edge(STATION_ID_5, STATION_ID_6, 10, 10);
    public static final Edge EDGE_55 = new Edge(STATION_ID_7, STATION_ID_3, 10, 10);
    public static final Edge EDGE_56 = new Edge(STATION_ID_7, STATION_ID_5, 10, 10);

    public static final Edge NEW_EDGE = new Edge(STATION_ID_4, STATION_ID_5, 10, 10);
}
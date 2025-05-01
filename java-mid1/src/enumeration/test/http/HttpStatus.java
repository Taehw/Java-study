package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Requeset"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    //깔끔하게 리턴문에서 작성해줄수도 있음.
    public boolean isSuccess() {
        if (200 <= code && code <= 299) {
            return true;
        } else {
            return false;
        }
    }
//    public boolean isSuccess() {
//        return code >= 200 && code <= 299;
//    }

    //해당 메소드 영한 쌤 풀이도 참고
    public static HttpStatus findByCode(int httpCodeInput) { //HttpStatus는 enum이고, findByCode는 모든 값에서 공통으로 쓸 수 있는 로직 -> static 해줘야됌

        HttpStatus status = switch (httpCodeInput) {
            case 200 -> HttpStatus.OK;
            case 400 -> HttpStatus.BAD_REQUEST;
            case 404 -> HttpStatus.NOT_FOUND;
            case 500 -> HttpStatus.INTERNAL_SERVER_ERROR;
            default -> null; //default 안해줘 httpCodeInput에 빨간줄 그어짐, 전체범위를 커버할수 없다고ㅜ
        };

        return status;
    }
    //영한풀이
//    public static HttpStatus findByCode(int code) {
//        for (HttpStatus status : values()) { //메서드 적극활용
//            if (status.getCode() == code) {
//                return status;
//            }
//        }
//        return null;
//    }
}

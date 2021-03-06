package com.example.schedulemanager.helper;

import com.example.schedulemanager.R;
import com.example.schedulemanager.vo.ActivityVO;

import java.util.ArrayList;

import static com.example.schedulemanager.helper.DataHelper.dataHelper;


public class BasicDataHelper {

    public ArrayList<ActivityVO> init(){
        ArrayList<ActivityVO> basicDataList = new ArrayList<ActivityVO>();
        makeLife(basicDataList);
        makeBusiness(basicDataList);
        makeIT(basicDataList);
        makeMedical(basicDataList);
        makeSchool(basicDataList);
        makeTravel(basicDataList);
        makeSports(basicDataList);
        makeCommorce(basicDataList);
        makeDev(basicDataList);
        return basicDataList;
    }

    private void makeDev(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("개발", "프로그래밍", "F", "icon_234", basicDataList);
        ActivityVO basicActivity13 = new ActivityVO("개발", "맥 프로그래밍", "F", "icon_235", basicDataList);
        ActivityVO basicActivity14 = new ActivityVO("개발", "디버깅", "F", "icon_236", basicDataList);
        ActivityVO basicActivity15 = new ActivityVO("개발", "서버 설정", "F", "icon_238", basicDataList);
        ActivityVO basicActivity16 = new ActivityVO("개발", "CSS3 작업", "F", "icon_239", basicDataList);
        ActivityVO basicActivity17 = new ActivityVO("개발", "설계", "F", "icon_241", basicDataList);
        ActivityVO basicActivity18 = new ActivityVO("개발", "HTML5", "F", "icon_242", basicDataList);
        ActivityVO basicActivity19 = new ActivityVO("개발", "키값 저장", "F", "icon_243", basicDataList);
        ActivityVO basicActivity20 = new ActivityVO("개발", "컨펌", "F", "icon_244", basicDataList);
        ActivityVO basicActivity21 = new ActivityVO("개발", "보안 설정", "F", "icon_245", basicDataList);
        ActivityVO basicActivity22 = new ActivityVO("개발", "TODO", "F", "icon_248", basicDataList);
        ActivityVO basicActivity23 = new ActivityVO("개발", "릴리즈", "F", "icon_249", basicDataList);
        ActivityVO basicActivity24 = new ActivityVO("개발", "공지", "F", "icon_250", basicDataList);
    }

    private void makeLife(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("일상/생활", "연락", "F", "icon_233", basicDataList);
        ActivityVO basicActivity13 = new ActivityVO("일상/생활", "연락처 관리", "F", "icon_201", basicDataList);
        ActivityVO basicActivity14 = new ActivityVO("일상/생활", "알람설정", "F", "icon_202", basicDataList);
        ActivityVO basicActivity15 = new ActivityVO("일상/생활", "샤워", "F", "icon_203", basicDataList);
        ActivityVO basicActivity16 = new ActivityVO("일상/생활", "술", "F", "icon_204", basicDataList);
        ActivityVO basicActivity17 = new ActivityVO("일상/생활", "쓰레기 버리기", "F", "icon_205", basicDataList);
        ActivityVO basicActivity18 = new ActivityVO("일상/생활", "점심식사", "F", "icon_206", basicDataList);
        ActivityVO basicActivity19 = new ActivityVO("일상/생활", "병원가기", "F", "icon_207", basicDataList);
        ActivityVO basicActivity20 = new ActivityVO("일상/생활", "클라우드 사용", "F", "icon_208", basicDataList);
        ActivityVO basicActivity22 = new ActivityVO("일상/생활", "커피타임", "F", "icon_209", basicDataList);
        ActivityVO basicActivity24 = new ActivityVO("일상/생활", "컴퓨터 작업", "F", "icon_210", basicDataList);
        ActivityVO basicActivity25 = new ActivityVO("일상/생활", "주차", "F", "icon_211", basicDataList);
        ActivityVO basicActivity26 = new ActivityVO("일상/생활", "챗팅", "F", "icon_212", basicDataList);
        ActivityVO basicActivity29 = new ActivityVO("일상/생활", "보드게임", "F", "icon_213", basicDataList);
        ActivityVO basicActivity30 = new ActivityVO("일상/생활", "게임", "F", "icon_214", basicDataList);
        ActivityVO basicActivity31 = new ActivityVO("일상/생활", "음악감상", "F", "icon_215", basicDataList);
        ActivityVO basicActivity32 = new ActivityVO("일상/생활", "간식", "F", "icon_216", basicDataList);
        ActivityVO basicActivity322 = new ActivityVO("일상/생활", "인터넷", "F", "icon_217", basicDataList);
        ActivityVO basicActivity33 = new ActivityVO("일상/생활", "위치파악", "F", "icon_218", basicDataList);
        ActivityVO basicActivity34 = new ActivityVO("일상/생활", "뉴스확인", "T", "icon_219", basicDataList);
        ActivityVO basicActivity35 = new ActivityVO("일상/생활", "영화감상", "F", "icon_220", basicDataList);
        ActivityVO basicActivity36 = new ActivityVO("일상/생활", "메세지", "F", "icon_221", basicDataList);
        ActivityVO basicActivity37 = new ActivityVO("일상/생활", "약먹기", "F", "icon_222", basicDataList);
        ActivityVO basicActivity38 = new ActivityVO("일상/생활", "저녁식사", "F", "icon_223", basicDataList);
        ActivityVO basicActivity39 = new ActivityVO("일상/생활", "검색", "F", "icon_224", basicDataList);
        ActivityVO basicActivity40 = new ActivityVO("일상/생활", "수리", "F", "icon_225", basicDataList);
        ActivityVO basicActivity41 = new ActivityVO("일상/생활", "쇼핑", "F", "icon_226", basicDataList);
        ActivityVO basicActivity42 = new ActivityVO("일상/생활", "취미활동", "F", "icon_227", basicDataList);
        ActivityVO basicActivity43 = new ActivityVO("일상/생활", "가게가기", "F", "icon_228", basicDataList);
        ActivityVO basicActivity44 = new ActivityVO("일상/생활", "티타임", "T", "icon_229", basicDataList);
        ActivityVO basicActivity45 = new ActivityVO("일상/생활", "TV", "F", "icon_230", basicDataList);
        ActivityVO basicActivity46 = new ActivityVO("일상/생활", "와인한잔", "F", "icon_231", basicDataList);
        ActivityVO basicActivity47 = new ActivityVO("일상/생활", "온라인 게임", "F", "icon_232", basicDataList);
        ActivityVO basicActivity48 = new ActivityVO("일상/생활", "VR", "F", "icon_200", basicDataList);
    }

    private void makeCommorce(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("거래활동", "24시간내 환불", "F", "icon_176");
        ActivityVO basicActivity13 = new ActivityVO("거래활동", "구매", "F", "icon_178");
        ActivityVO basicActivity14 = new ActivityVO("거래활동", "온라인 쇼핑", "F", "icon_179");
        ActivityVO basicActivity15 = new ActivityVO("거래활동", "쿠폰받기", "F", "icon_181");
        ActivityVO basicActivity16 = new ActivityVO("거래활동", "신용카드 확인", "F", "icon_182");
        ActivityVO basicActivity17 = new ActivityVO("거래활동", "택배", "F", "icon_183");
        ActivityVO basicActivity18 = new ActivityVO("거래활동", "할인체크", "F", "icon_184");
        ActivityVO basicActivity19 = new ActivityVO("거래활동", "선물사기", "T", "icon_186");
        ActivityVO basicActivity20 = new ActivityVO("거래활동", "컴퓨터 구매", "F", "icon_187");
        ActivityVO basicActivity22 = new ActivityVO("거래활동", "카드로 구매", "F", "icon_188");
        ActivityVO basicActivity24 = new ActivityVO("거래활동", "물건 확인", "F", "icon_189");
        ActivityVO basicActivity25 = new ActivityVO("거래활동", "상품문의", "F", "icon_190");
        ActivityVO basicActivity26 = new ActivityVO("거래활동", "포장", "F", "icon_191");
        ActivityVO basicActivity29 = new ActivityVO("거래활동", "택배 보내기", "F", "icon_192");
        ActivityVO basicActivity30 = new ActivityVO("거래활동", "저축", "F", "icon_193");
        ActivityVO basicActivity31 = new ActivityVO("거래활동", "출금", "F", "icon_194");
        ActivityVO basicActivity32 = new ActivityVO("거래활동", "세일", "F", "icon_195");
        ActivityVO basicActivity322 = new ActivityVO("거래활동", "입금", "F", "icon_197");
        ActivityVO basicActivity33 = new ActivityVO("거래활동", "탑세일", "F", "icon_198");
        ActivityVO basicActivity34 = new ActivityVO("거래활동", "지출", "F", "icon_199");

        basicDataList.add(basicActivity12);
        basicDataList.add(basicActivity13);
        basicDataList.add(basicActivity14);
        basicDataList.add(basicActivity15);
        basicDataList.add(basicActivity16);
        basicDataList.add(basicActivity17);
        basicDataList.add(basicActivity18);
        basicDataList.add(basicActivity19);
        basicDataList.add(basicActivity20);
        basicDataList.add(basicActivity22);
        basicDataList.add(basicActivity24);
        basicDataList.add(basicActivity25);
        basicDataList.add(basicActivity26);
        basicDataList.add(basicActivity29);
        basicDataList.add(basicActivity30);
        basicDataList.add(basicActivity31);
        basicDataList.add(basicActivity32);
        basicDataList.add(basicActivity322);
        basicDataList.add(basicActivity33);
        basicDataList.add(basicActivity34);
    }

    private void makeSports(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("오락/스포츠", "야구", "T", "icon_145");
        ActivityVO basicActivity13 = new ActivityVO("오락/스포츠", "농구", "F", "icon_146");
        ActivityVO basicActivity14 = new ActivityVO("오락/스포츠", "자전거", "F", "icon_147");
        ActivityVO basicActivity15 = new ActivityVO("오락/스포츠", "당구", "F", "icon_148");
        ActivityVO basicActivity16 = new ActivityVO("오락/스포츠", "볼링", "F", "icon_149");
        ActivityVO basicActivity17 = new ActivityVO("오락/스포츠", "포커", "F", "icon_150");
        ActivityVO basicActivity18 = new ActivityVO("오락/스포츠", "체스", "F", "icon_152");
        ActivityVO basicActivity19 = new ActivityVO("오락/스포츠", "다이빙", "F", "icon_154");
        ActivityVO basicActivity20 = new ActivityVO("오락/스포츠", "덤벨", "F", "icon_155");
        ActivityVO basicActivity22 = new ActivityVO("오락/스포츠", "골프", "F", "icon_158");
        ActivityVO basicActivity24 = new ActivityVO("오락/스포츠", "라이딩", "F", "icon_159");
        ActivityVO basicActivity25 = new ActivityVO("오락/스포츠", "하키", "F", "icon_160");
        ActivityVO basicActivity26 = new ActivityVO("오락/스포츠", "탁구", "F", "icon_163");
        ActivityVO basicActivity29 = new ActivityVO("오락/스포츠", "레이싱", "F", "icon_164");
        ActivityVO basicActivity30 = new ActivityVO("오락/스포츠", "미식축구", "F", "icon_165");
        ActivityVO basicActivity31 = new ActivityVO("오락/스포츠", "요트", "F", "icon_166");
        ActivityVO basicActivity32 = new ActivityVO("오락/스포츠", "스케이트", "F", "icon_168");
        ActivityVO basicActivity322 = new ActivityVO("오락/스포츠", "줄넘기", "F", "icon_169");
        ActivityVO basicActivity33 = new ActivityVO("오락/스포츠", "축구", "F", "icon_170");
        ActivityVO basicActivity34 = new ActivityVO("오락/스포츠", "월드컵", "F", "icon_171");
        ActivityVO basicActivity35 = new ActivityVO("오락/스포츠", "기록재기", "F", "icon_172");
        ActivityVO basicActivity37 = new ActivityVO("오락/스포츠", "테니스", "F", "icon_173");
        ActivityVO basicActivity38 = new ActivityVO("오락/스포츠", "올림픽", "F", "icon_174");
        ActivityVO basicActivity39 = new ActivityVO("오락/스포츠", "웨이트", "F", "icon_175");

        basicDataList.add(basicActivity12);
        basicDataList.add(basicActivity13);
        basicDataList.add(basicActivity14);
        basicDataList.add(basicActivity15);
        basicDataList.add(basicActivity16);
        basicDataList.add(basicActivity17);
        basicDataList.add(basicActivity18);
        basicDataList.add(basicActivity19);
        basicDataList.add(basicActivity20);
        basicDataList.add(basicActivity22);
        basicDataList.add(basicActivity24);
        basicDataList.add(basicActivity25);
        basicDataList.add(basicActivity26);
        basicDataList.add(basicActivity29);
        basicDataList.add(basicActivity30);
        basicDataList.add(basicActivity31);
        basicDataList.add(basicActivity32);
        basicDataList.add(basicActivity322);
        basicDataList.add(basicActivity33);
        basicDataList.add(basicActivity34);
        basicDataList.add(basicActivity35);
        basicDataList.add(basicActivity37);
        basicDataList.add(basicActivity38);
        basicDataList.add(basicActivity39);
    }

    private void makeTravel(ArrayList<ActivityVO> basicDataList) {
            ActivityVO basicActivity12 = new ActivityVO("여행", "비행기 탑승", "F", "icon_116");
            ActivityVO basicActivity13 = new ActivityVO("여행", "환승", "F", "icon_117");
            ActivityVO basicActivity14 = new ActivityVO("여행", "시간확인", "F", "icon_118");
            ActivityVO basicActivity15 = new ActivityVO("여행", "칵테일 한잔", "F", "icon_119");
            ActivityVO basicActivity16 = new ActivityVO("여행", "코코넛 칵테일 한잔", "F", "icon_120");
            ActivityVO basicActivity17 = new ActivityVO("여행", "방향설정", "F", "icon_121");
            ActivityVO basicActivity18 = new ActivityVO("여행", "크루즈쉽 탑승", "F", "icon_122");
            ActivityVO basicActivity19 = new ActivityVO("여행", "방문", "F", "icon_124");
            ActivityVO basicActivity20 = new ActivityVO("여행", "KTX로 가기", "F", "icon_125");
            ActivityVO basicActivity22 = new ActivityVO("여행", "섬으로", "F", "icon_126");
            ActivityVO basicActivity24 = new ActivityVO("여행", "로비에서", "F", "icon_127");
            ActivityVO basicActivity25 = new ActivityVO("여행", "바다로", "F", "icon_128");
            ActivityVO basicActivity26 = new ActivityVO("여행", "지도확인", "F", "icon_129");
            ActivityVO basicActivity29 = new ActivityVO("여행", "산으로", "F", "icon_130");
            ActivityVO basicActivity30 = new ActivityVO("여행", "체크인", "F", "icon_131");
            ActivityVO basicActivity31 = new ActivityVO("여행", "호텔에서 휴식", "F", "icon_132");
            ActivityVO basicActivity32 = new ActivityVO("여행", "숙박", "F", "icon_133");
            ActivityVO basicActivity322 = new ActivityVO("여행", "야외활동", "F", "icon_134");
            ActivityVO basicActivity33 = new ActivityVO("여행", "태그달기", "F", "icon_135");
            ActivityVO basicActivity34 = new ActivityVO("여행", "텐트숙박", "F", "icon_136");
            ActivityVO basicActivity35 = new ActivityVO("여행", "티켓예매", "F", "icon_137");
            ActivityVO basicActivity37 = new ActivityVO("여행", "화장실 미리가기", "F", "icon_138");
            ActivityVO basicActivity38 = new ActivityVO("여행", "온천", "F", "icon_139");
            ActivityVO basicActivity39 = new ActivityVO("여행", "기차로 가기", "F", "icon_140");
            ActivityVO basicActivity40 = new ActivityVO("여행", "여행준비", "F", "icon_141");
            ActivityVO basicActivity41 = new ActivityVO("여행", "여행가방 찾기", "F", "icon_142");
            ActivityVO basicActivity42 = new ActivityVO("여행", "외식", "F", "icon_143");
            ActivityVO basicActivity43 = new ActivityVO("여행", "모래사장으로", "F", "icon_144");

            basicDataList.add(basicActivity12);
            basicDataList.add(basicActivity13);
            basicDataList.add(basicActivity14);
            basicDataList.add(basicActivity15);
            basicDataList.add(basicActivity16);
            basicDataList.add(basicActivity17);
            basicDataList.add(basicActivity18);
            basicDataList.add(basicActivity19);
            basicDataList.add(basicActivity20);
            basicDataList.add(basicActivity22);
            basicDataList.add(basicActivity24);
            basicDataList.add(basicActivity25);
            basicDataList.add(basicActivity26);
            basicDataList.add(basicActivity29);
            basicDataList.add(basicActivity30);
            basicDataList.add(basicActivity31);
            basicDataList.add(basicActivity32);
            basicDataList.add(basicActivity322);
            basicDataList.add(basicActivity33);
            basicDataList.add(basicActivity34);
            basicDataList.add(basicActivity35);
            basicDataList.add(basicActivity37);
            basicDataList.add(basicActivity38);
            basicDataList.add(basicActivity39);
            basicDataList.add(basicActivity40);
            basicDataList.add(basicActivity41);
            basicDataList.add(basicActivity42);
            basicDataList.add(basicActivity43);
        }


    private void makeSchool(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("학교", "화학수업", "F", "icon_88");
        ActivityVO basicActivity13 = new ActivityVO("학교", "학교준비", "F", "icon_89");
        ActivityVO basicActivity14 = new ActivityVO("학교", "수업끝", "F", "icon_90");
        ActivityVO basicActivity15 = new ActivityVO("학교", "과제", "F", "icon_91");
        ActivityVO basicActivity16 = new ActivityVO("학교", "미술수업", "F", "icon_92");
        ActivityVO basicActivity17 = new ActivityVO("학교", "역사수업", "F", "icon_93");
        ActivityVO basicActivity18 = new ActivityVO("학교", "수료", "F", "icon_94");
        ActivityVO basicActivity19 = new ActivityVO("학교", "수학수업", "F", "icon_95");
        ActivityVO basicActivity20 = new ActivityVO("학교", "미술수업", "F", "icon_96");
        ActivityVO basicActivity22 = new ActivityVO("학교", "학교기관", "F", "icon_97");
        ActivityVO basicActivity24 = new ActivityVO("학교", "기하학", "F", "icon_98");
        ActivityVO basicActivity25 = new ActivityVO("학교", "성적확인", "F", "icon_100");
        ActivityVO basicActivity26 = new ActivityVO("학교", "해외탐방", "F", "icon_99");
        ActivityVO basicActivity29 = new ActivityVO("학교", "시험공부", "F", "icon_101");
        ActivityVO basicActivity30 = new ActivityVO("학교", "시험", "F", "icon_102");
        ActivityVO basicActivity31 = new ActivityVO("학교", "수업등록", "F", "icon_103");
        ActivityVO basicActivity32 = new ActivityVO("학교", "레포트 작성", "F", "icon_104");
        ActivityVO basicActivity322 = new ActivityVO("학교", "레포트 제출", "F", "icon_105");
        ActivityVO basicActivity33 = new ActivityVO("학교", "발표", "F", "icon_107");
        ActivityVO basicActivity34 = new ActivityVO("학교", "학교끝", "F", "icon_108");
        ActivityVO basicActivity35 = new ActivityVO("학교", "스쿨버스", "T", "icon_109");
        ActivityVO basicActivity37 = new ActivityVO("학교", "과학수업", "F", "icon_110");
        ActivityVO basicActivity38 = new ActivityVO("학교", "논문 작성", "F", "icon_111");
        ActivityVO basicActivity39 = new ActivityVO("학교", "우주과학 수업", "F", "icon_112");
        ActivityVO basicActivity40 = new ActivityVO("학교", "도서관", "F", "icon_113");
        ActivityVO basicActivity41 = new ActivityVO("학교", "강당", "F", "icon_114");
        ActivityVO basicActivity42 = new ActivityVO("학교", "졸업", "F", "icon_115");

        basicDataList.add(basicActivity12);
        basicDataList.add(basicActivity13);
        basicDataList.add(basicActivity14);
        basicDataList.add(basicActivity15);
        basicDataList.add(basicActivity16);
        basicDataList.add(basicActivity17);
        basicDataList.add(basicActivity18);
        basicDataList.add(basicActivity19);
        basicDataList.add(basicActivity20);
        basicDataList.add(basicActivity22);
        basicDataList.add(basicActivity24);
        basicDataList.add(basicActivity25);
        basicDataList.add(basicActivity26);
        basicDataList.add(basicActivity29);
        basicDataList.add(basicActivity30);
        basicDataList.add(basicActivity31);
        basicDataList.add(basicActivity32);
        basicDataList.add(basicActivity322);
        basicDataList.add(basicActivity33);
        basicDataList.add(basicActivity34);
        basicDataList.add(basicActivity35);
        basicDataList.add(basicActivity37);
        basicDataList.add(basicActivity38);
        basicDataList.add(basicActivity39);
        basicDataList.add(basicActivity40);
        basicDataList.add(basicActivity41);
        basicDataList.add(basicActivity42);
    }

    private void makeMedical(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("의료", "구급차 타기", "F", "icon_59");
        ActivityVO basicActivity13 = new ActivityVO("의료", "의약통 준비", "F", "icon_60");
        ActivityVO basicActivity14 = new ActivityVO("의료", "심장 강화 운동", "F", "icon_61");
        ActivityVO basicActivity15 = new ActivityVO("의료", "수액맞기", "F", "icon_62");
        ActivityVO basicActivity16 = new ActivityVO("의료", "혈압측정", "F", "icon_63");
        ActivityVO basicActivity17 = new ActivityVO("의료", "관장", "F", "icon_64");
        ActivityVO basicActivity18 = new ActivityVO("의료", "시력검사", "F", "icon_65");
        ActivityVO basicActivity19 = new ActivityVO("의료", "심박수 측정", "F", "icon_67");
        ActivityVO basicActivity20 = new ActivityVO("의료", "의료 헬리콥터 타기", "F", "icon_68");
        ActivityVO basicActivity22 = new ActivityVO("의료", "병원위치 확인", "F", "icon_69");
        ActivityVO basicActivity24 = new ActivityVO("의료", "의료기록 확인", "F", "icon_70");
        ActivityVO basicActivity25 = new ActivityVO("의료", "입원", "F", "icon_71");
        ActivityVO basicActivity26 = new ActivityVO("의료", "현미경 사용", "F", "icon_72");
        ActivityVO basicActivity29 = new ActivityVO("의료", "산소 공급기 사용", "F", "icon_73");
        ActivityVO basicActivity30 = new ActivityVO("의료", "간호사 상담", "F", "icon_74");
        ActivityVO basicActivity31 = new ActivityVO("의료", "약준비", "F", "icon_75");
        ActivityVO basicActivity32 = new ActivityVO("의료", "밴드 사용", "F", "icon_76");
        ActivityVO basicActivity322 = new ActivityVO("의료", "양수기 사용", "F", "icon_77");
        ActivityVO basicActivity33 = new ActivityVO("의료", "X레이", "F", "icon_78");
        ActivityVO basicActivity34 = new ActivityVO("의료", "치과진료", "F", "icon_79");
        ActivityVO basicActivity35 = new ActivityVO("의료", "진찰받기", "F", "icon_81");
        ActivityVO basicActivity37 = new ActivityVO("의료", "주사맞기", "F", "icon_82");
        ActivityVO basicActivity38 = new ActivityVO("의료", "처방전 받기", "T", "icon_83");
        ActivityVO basicActivity39 = new ActivityVO("의료", "시험관 사용", "F", "icon_84");
        ActivityVO basicActivity40 = new ActivityVO("의료", "체온측정", "F", "icon_85");

        basicDataList.add(basicActivity12);
        basicDataList.add(basicActivity13);
        basicDataList.add(basicActivity14);
        basicDataList.add(basicActivity15);
        basicDataList.add(basicActivity16);
        basicDataList.add(basicActivity17);
        basicDataList.add(basicActivity18);
        basicDataList.add(basicActivity19);
        basicDataList.add(basicActivity20);
        basicDataList.add(basicActivity22);
        basicDataList.add(basicActivity24);
        basicDataList.add(basicActivity25);
        basicDataList.add(basicActivity26);
        basicDataList.add(basicActivity29);
        basicDataList.add(basicActivity30);
        basicDataList.add(basicActivity31);
        basicDataList.add(basicActivity32);
        basicDataList.add(basicActivity322);
        basicDataList.add(basicActivity33);
        basicDataList.add(basicActivity34);
        basicDataList.add(basicActivity35);
        basicDataList.add(basicActivity37);
        basicDataList.add(basicActivity38);
        basicDataList.add(basicActivity39);
        basicDataList.add(basicActivity40);
    }

    private void makeIT(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity12 = new ActivityVO("IT", "충전", "F", "icon_31");
        ActivityVO basicActivity13 = new ActivityVO("IT", "영상녹화", "F", "icon_32");
        ActivityVO basicActivity14 = new ActivityVO("IT", "사진촬영", "F", "icon_33");
        ActivityVO basicActivity15 = new ActivityVO("IT", "저장", "F", "icon_34");
        ActivityVO basicActivity16 = new ActivityVO("IT", "e북사용", "F", "icon_35");
        ActivityVO basicActivity17 = new ActivityVO("IT", "음향조절", "F", "icon_36");
        ActivityVO basicActivity18 = new ActivityVO("IT", "지문스캔", "F", "icon_37");
        ActivityVO basicActivity19 = new ActivityVO("IT", "USB 저장", "F", "icon_38");
        ActivityVO basicActivity20 = new ActivityVO("IT", "동영상 제작", "F", "icon_39");
        ActivityVO basicActivity22 = new ActivityVO("IT", "타블렛 사용", "F", "icon_41");
        ActivityVO basicActivity24 = new ActivityVO("IT", "마이크 테스트", "F", "icon_43");
        ActivityVO basicActivity25 = new ActivityVO("IT", "멀티미디어 재생", "F", "icon_44");
        ActivityVO basicActivity26 = new ActivityVO("IT", "스피커 테스트", "F", "icon_45");
        ActivityVO basicActivity29 = new ActivityVO("IT", "프로젝터 사용", "F", "icon_48");
        ActivityVO basicActivity30 = new ActivityVO("IT", "라디오 사용", "F", "icon_49");
        ActivityVO basicActivity31 = new ActivityVO("IT", "안테나 정비", "F", "icon_50");
        ActivityVO basicActivity32 = new ActivityVO("IT", "sdcard 사용", "F", "icon_51");
        ActivityVO basicActivity322 = new ActivityVO("IT", "simcard 사용", "F", "icon_52");
        ActivityVO basicActivity33 = new ActivityVO("IT", "씬 촬영", "F", "icon_53");
        ActivityVO basicActivity34 = new ActivityVO("IT", "스마트 워치 사용", "F", "icon_54");
        ActivityVO basicActivity35 = new ActivityVO("IT", "장비 설치", "F", "icon_55");
        ActivityVO basicActivity37 = new ActivityVO("IT", "웹캠 사용", "F", "icon_57");
        ActivityVO basicActivity38 = new ActivityVO("IT", "와이파이 설정", "F", "icon_58");

        basicDataList.add(basicActivity12);
        basicDataList.add(basicActivity13);
        basicDataList.add(basicActivity14);
        basicDataList.add(basicActivity15);
        basicDataList.add(basicActivity16);
        basicDataList.add(basicActivity17);
        basicDataList.add(basicActivity18);
        basicDataList.add(basicActivity19);
        basicDataList.add(basicActivity20);
        basicDataList.add(basicActivity22);
        basicDataList.add(basicActivity24);
        basicDataList.add(basicActivity25);
        basicDataList.add(basicActivity26);
        basicDataList.add(basicActivity29);
        basicDataList.add(basicActivity30);
        basicDataList.add(basicActivity31);
        basicDataList.add(basicActivity32);
        basicDataList.add(basicActivity322);
        basicDataList.add(basicActivity33);
        basicDataList.add(basicActivity34);
        basicDataList.add(basicActivity35);
        basicDataList.add(basicActivity37);
        basicDataList.add(basicActivity38);
    }

    private void makeBusiness(ArrayList<ActivityVO> basicDataList) {
        ActivityVO basicActivity11 = new ActivityVO("비지니스", "은행", "F", "icon_1");
        ActivityVO basicActivity12 = new ActivityVO("비지니스", "발표", "F", "icon_12");
        ActivityVO basicActivity13 = new ActivityVO("비지니스", "출장", "T", "icon_22");
        ActivityVO basicActivity14 = new ActivityVO("비지니스", "부동산", "F", "icon_23");
        ActivityVO basicActivity15 = new ActivityVO("비지니스", "회의", "F", "icon_24");
        ActivityVO basicActivity16 = new ActivityVO("비지니스", "계산", "F", "icon_25");
        ActivityVO basicActivity17 = new ActivityVO("비지니스", "약속", "T", "icon_26");
        ActivityVO basicActivity18 = new ActivityVO("비지니스", "투자", "F", "icon_27");
        ActivityVO basicActivity19 = new ActivityVO("비지니스", "주식", "F", "icon_28");
        ActivityVO basicActivity20 = new ActivityVO("비지니스", "문서", "F", "icon_3");
        ActivityVO basicActivity21 = new ActivityVO("비지니스", "문서정리", "F", "icon_4");
        ActivityVO basicActivity22 = new ActivityVO("비지니스", "문서찾기", "F", "icon_5");
        ActivityVO basicActivity23 = new ActivityVO("비지니스", "이메일", "F", "icon_6");
        ActivityVO basicActivity24 = new ActivityVO("비지니스", "공장", "F", "icon_7");
        ActivityVO basicActivity25 = new ActivityVO("비지니스", "문서수집", "F", "icon_8");
        ActivityVO basicActivity26 = new ActivityVO("비지니스", "목표", "F", "icon_9");
        ActivityVO basicActivity27 = new ActivityVO("비지니스", "외부미팅", "F", "icon_10");
        ActivityVO basicActivity28 = new ActivityVO("비지니스", "추정", "F", "icon_11");
        ActivityVO basicActivity29 = new ActivityVO("비지니스", "노트", "F", "icon_13");
        ActivityVO basicActivity30 = new ActivityVO("비지니스", "메모", "T", "icon_14");
        ActivityVO basicActivity31 = new ActivityVO("비지니스", "상사", "F", "icon_15");
        ActivityVO basicActivity32 = new ActivityVO("비지니스", "해외", "F", "icon_16");
        ActivityVO basicActivity33 = new ActivityVO("비지니스", "인쇄", "F", "icon_17");
        ActivityVO basicActivity34 = new ActivityVO("비지니스", "보안", "F", "icon_18");
        ActivityVO basicActivity35 = new ActivityVO("비지니스", "미션", "F", "icon_19");
        ActivityVO basicActivity36 = new ActivityVO("비지니스", "계획", "T", "icon_29");
        ActivityVO basicActivity37 = new ActivityVO("비지니스", "배치", "F", "icon_20");
        ActivityVO basicActivity38 = new ActivityVO("비지니스", "지불", "F", "icon_21");

        basicDataList.add(basicActivity11);
        basicDataList.add(basicActivity12);
        basicDataList.add(basicActivity13);
        basicDataList.add(basicActivity14);
        basicDataList.add(basicActivity15);
        basicDataList.add(basicActivity16);
        basicDataList.add(basicActivity17);
        basicDataList.add(basicActivity18);
        basicDataList.add(basicActivity19);
        basicDataList.add(basicActivity20);
        basicDataList.add(basicActivity21);
        basicDataList.add(basicActivity22);
        basicDataList.add(basicActivity23);
        basicDataList.add(basicActivity24);
        basicDataList.add(basicActivity25);
        basicDataList.add(basicActivity26);
        basicDataList.add(basicActivity27);
        basicDataList.add(basicActivity28);
        basicDataList.add(basicActivity29);
        basicDataList.add(basicActivity30);
        basicDataList.add(basicActivity31);
        basicDataList.add(basicActivity32);
        basicDataList.add(basicActivity33);
        basicDataList.add(basicActivity34);
        basicDataList.add(basicActivity35);
        basicDataList.add(basicActivity36);
        basicDataList.add(basicActivity37);
        basicDataList.add(basicActivity38);

    }
}

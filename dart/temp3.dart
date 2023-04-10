// final 값이 들어오면 고정
// static 프로그램이 켜질 때 변수가 만들어진다
// static final 프로그램이 켜질 때 + 값이 이미 들어와있는 상태니까 고정
// const 는 값은 이미 고정 되었는데, 변수가 만들어지는 것은 호출할 때
// static const 는 프로그램이 켜질 때 변수가 만들어지고 값이 고정되는 것

class Dog {
  // 프로그램이 켜질 때 변수가 됨
  // 고정이 아니고, 고정을 시킬려면 final const
  static int count = 0;
  static increase() {
    count++;
  }

  Dog() {
    increase();
  }
}

void main(List<String> args) {
  List a = const []; // 새리스트객체
  List b = const [];

  const int b = 1;

  int i = 1;
  int i = 2;

  // b = 2;
  // print(a);

  // main -> print

  // // 변수가 생성되는거는 main함수가 실행된 이후
  // // 프로그램이 켜질 때 이미 고정
  // // 값을 안넣어줬기 때문에 에러
  // const String data1 = "무조건";
  // data1 = "aa";

  // // 내가 값을 넣을 때 고정
  // // 안넣어줘도 에러가 안난다
  // final String data2;
  // data2 = "안녕";
  // data2 = "aa";
}

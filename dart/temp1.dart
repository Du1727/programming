void main(List<String> args) {
  // List<int> intList = [1, 2, 3, 4, 5];

  // // 목표 : 위 리스트를 String List로 만들어라
  // // 리스트의 요소 타입을 바꿀 때 사용

  // List<String> stringList = intList.map((e) {
  //   return e.toString();
  // }).toList();

  // print(stringList);

  // dto를 위젯으로 바꿀 때
  List<int> intList = [1, 2, 3, 4, 5];

  intList.map((e) {
    return Container(
      child: Text(e.toString()),
    );
  }).toList();

  List<Widget>

}

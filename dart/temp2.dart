void main(List<String> args) {
  print(new Cat("길냥이").name);
  print(new Cat("집냥이").name);

  print(Dog.name);
  Dog.name = "다른강아지";
  print(Dog.name);
}

class Cat {
  final String name; // 고양이가 태어나는 시점에 이름이 정해져서 고정 (값을 넣어준 시점에 고정)
  Cat(this.name);
}

class Dog {
  static const String name = "강아지"; // 프로그램을 켤 때 고정
}

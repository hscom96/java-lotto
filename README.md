# 로또
## 구현할 기능 목록
- 로또 구입 금액 입력
    - 구입 금액 유효성 검사
        - 빈 값 혹은 null 값인가?
        - 숫자가 맞는가?
        - 1000의 배수인가? 
    - 구입한 로또 개수 출력
    
- 수동으로 구매할 로또 수를 입력
  - 빈 값 혹은 null 값인가?
    - 빈 값 혹은 null 값 일 경우 0장을 수동으로 구매한 것으로 한다
  - 숫자가 맞는가?
  - 구매한 로또 수보다 크지 않은가? 

- 수동으로 구매할 로또 번호 입력
  - 빈 값 혹은 null 값인가?
  - 숫자 혹은 콤마만 입력했는가?
  - 입력한 숫자의 배열의 사이즈기 6이 맞는가?
  - 중복이 없는가?
    
- 구입 금액에서 수동으로 구매한 로또를 뺀 만큼 로또 발급
    - 구입 금액에서 수동으로 구매한 로또를 뺀 만큼 로또 자동 생성
    - 로또 정렬
    - 생성된 로또 출력
    
- 지난주 당첨 번호 입력
    - 당첨 번호 유효성 검사
        - 빈 값 혹은 null 값인가?
        - 숫자 혹은 콤마만 입력했는가?
        - 입력한 숫자의 배열의 사이즈가 6이 맞는가?
        - 중복이 없는가?

- 보너스 볼 입력
  - 당첨 번호 유효성 검사
    - 로또 넘버 클래스 생성자에서 유효성 검사를 진행한다
    
- 로또 당첨 결과 확인
  - 하나의 로또가 몇 개의 당첨 번호와 일치하는지 확인
  - 당첨 카운트를 토대로 로또 당첨 금액 계산
    
- 당첨 결과를 OutputView에 전달 및 결과 출력
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
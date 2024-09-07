# 🌿 ChatHealth 🌿

> ### 🧑‍💻 프로젝트 소개
> 
> ---
>
> <img style="background-color: #FFF" width="786" alt="Main Logo" src="https://github.com/user-attachments/assets/08513f01-fe78-4fe8-99f8-c4e8696714c4">
> 
> ---
> 
> * "대한민국, 건강을 말하다". 정말로 나에게 필요한 건강기능식품을 찾아갈 수 있도록 돕는 플랫폼입니다. 현재 나의 상태를 기반으로 어떤 성분이 내 몸에 도움이 되는지 알아보고, 다른 사람들의 생생한 후기까지 함께 확인할수 있는 애플리케이션의 프로토타입을 구현하였습니다.
> * 건강기능식품을 찾아보고 싶은 사용자들을 위해 건강기능식품 정보를 제공하고, 사용자들이 건강기능식품에 대한 후기를 남길 수 있는 커뮤니티를 제공합니다.
> * 사용자들이 건강기능식품 정보를 찾아보고, 후기를 남기며 서로 소통할 수 있는 플랫폼을 제공합니다.
> * 커뮤니티의 활성화를 위해 사용자들이 자유롭게 글을 작성하고, 쪽지 및 채팅 기능을 통해 소통할 수 있도록 합니다.


> ### 🕰️ 개발 기간
> 
> ---
> 
> * 2024.01.05 ~ 2024.02.19


> ### 📌 주요 기능
> 
> ---
> 
> |                                              <b>메인 페이지</b>                                               |                                               <b>회원가입</b>                                                |
> |:--------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------:|
> | <img src="https://github.com/user-attachments/assets/831ce6f8-fa12-4451-9b20-03ca8b292ed9" width="300"/> | <img src="https://github.com/user-attachments/assets/229d83c8-d2f2-4ba1-9d18-ac1aed4aeee4" width="300"/> |
> |                                                <b>로그인</b>                                                |                                            <b>제품 조회 및 검색</b>                                             |
> | <img src="https://github.com/user-attachments/assets/c8e0a407-043e-48d3-8726-f1228f76e125" width="300"/> | <img src="https://github.com/user-attachments/assets/50a7bcb8-04e5-4fbc-9f69-464fe8d43421" width="300"/> |
> |                                            <b>제품 상세 및 리뷰</b>                                             |                                         <b>커뮤니티 글 목록 조회 및 검색</b>                                         |
> | <img src="https://github.com/user-attachments/assets/2d87e0b7-a052-4f78-adc8-873a1ff16ef9" width="300"/> | <img src="https://github.com/user-attachments/assets/29151974-613f-41d0-b4c3-333abb541754" width="300"/> |
> |                                          <b>커뮤니티 글 조회 및 댓글</b>                                           |                                              <b>쪽지 수•발신</b>                                              |
> | <img src="https://github.com/user-attachments/assets/44d7e7e2-2e63-4ab5-90e1-8c4c01e4a558" width="300"/> | <img src="https://github.com/user-attachments/assets/8c85aa1f-bcd3-40ef-9426-af0ab2b49103" width="300"/> |
> |                                               <b>익명 채팅</b>                                               |                                              <b>마이 페이지</b>                                               |
> | <img src="https://github.com/user-attachments/assets/756c9ba9-b93f-4942-a648-ef2d89d7f311" width="300"/> | <img src="https://github.com/user-attachments/assets/1f494b46-a4f0-418e-9589-ae9d6c36d61a" width="300"/> |



> ### 👪 개발자 소개
> 
> ---
> 
> * 배찬용 : DB설계, 회원 관리, 발표
> * 정규선 : 건강기능식품 게시판, 데이터 조사
> * 조원우 : 깃허브 관리, 건강기능 식품 기능, 커뮤니티, 쪽지•채팅 기능, 서버 생성 및 배포


> ### 💻 기술 스택
> 
> ---
> 
> <img width="1968" alt="Tech Stack" src="https://github.com/chatHealth/chathealth/assets/140994218/ce303a9b-d3ca-44ab-8805-32cae7b9cae6">


> ### 🛠️ 협업 툴
> 
> ---
> 
> <img width="890" alt="cooperative tools (1)" src="https://github.com/chatHealth/chathealth/assets/140994218/96ffbe1b-84a9-4960-8579-50eda35fb536">


> ### 🌵 Git Flow
> 
> ---
> 
> ```
> main
> ├── dev
> │   └── feature
> └── hotfix
> ```
> * ***main***: 배포용 브랜치. 모든 기능이 정상적으로 동작하는 상태만 병합
> * ***dev***: 개발 브랜치. 각 기능별로 브랜치를 생성하여 병합. 테스트 후 main 브랜치로 병합
> * ***feature***: 특정 기능을 개발하는 브랜치. 각 기능 완성시 dev 브랜치로 병합
> * ***hotfix***: 배포 후 발생한 버그를 수정하는 브랜치. main 브랜치로 병합


> ### 📝 Convention
> 
> ---
> 
> * Commit Message<br>
>> ```Feat```: 새로운 기능 추가<br>
> ```Fix```: 버그 수정<br>
> ```Hotfix```: 급한 버그 수정<br>
> ```Test```: 테스트 코드 작성<br><br>
> ```Design```: CSS 등 디자인 변경<br>
> ```Refactor```: 코드 리팩토링<br>
> ```Style```: 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우<br>
> ```Docs```: 문서 변경<br><br>
> ```Chore```: 빌드 업무 수정, 패키지 매니저 수정<br>
> ```Comment```: 필요한 주석 추가 및 변경<br>
> ```Rename```: 파일 혹은 폴더명을 수정하거나 옮기는 작업만인 경우<br>
> ```Remove```: 파일을 삭제하는 작업만 수행한 경우
> 
> ---
> 
> * 디렉토리 구조<br>
>> **디렉토리명**: UnderCase로 작성 (ex.) ```main/java/config```<br>
> **자바 파일명**: PascalCase로 작성 (ex.) ```main/java/config/WebConfig.java```<br>
> **페이지 파일명**: kebab-case로 작성 (ex.) ```main/resources/templates/auth/user-join.html```<br>
> 
> ---
> 
> * 변수, 상수<br>
>> **변수명**: camelCase로 작성 (ex.) ```int chatHealth = 1000```<br>
> **상수명**: 대문자로 작성 (ex.) ```final int CHAT_HEALTH = 1000```<br>
> 
> ---
> 
> * Milestone, Issue<br>
>> **Milestone**: 각 화면 구상도에 따른 화면 별로 마일스톤<br>
> **Issue**: 각 마일스톤에 따라 기능 별로 이슈 생성<br>
> **Checklist**: 각 이슈에 대해 더 세세하게 체크리스트 활용<br>


> ### 📚 ERD
> 
> ---
> 
> <img alt="ERD Diagram" src="https://github.com/user-attachments/assets/a57f22cd-2975-4289-8197-81c1eb29bd36">


> ### 🚀 기술적 도전과 해결
> 
> ---
> 
> #### 1. **권한**
> 사용자의 권한이 여러 가지로 나뉘어져 있어서 이를 어떻게 관리할지 고민을 하였습니다.
> * **DB설계시**: 데이터베이스 상에서 사용자의 권한을 어떻게 관리할지에 대한 고민. 서비스의 규모가 크지 않다고 판단을 하였으므로 단일 테이블 전략을 택하여 권한을 관리하는 컬럼을 추가하여 구분.
> * **접근제어**: 사용자의 접근 권한 관리를 위해 spring security를 사용하여 filter chain을 이용하여 접근 권한을 관리.
> 
> ---
> 
> #### 2. **쪽지 알림**
> 사용자가 쪽지를 받았을 때 알림을 주는 방법에 대한 고민. 처음에는 Polling 방식을 사용하였으나, 이는 서버에 부하를 주는 문제가 발생. 그래서 SSE(Server-Sent Events)를 사용하여 실시간으로 알림을 주는 방식으로 변경.
> * Polling 방식: 처음에는 클라이언트에서 15초마다 서버에 접근을 하여 새로운 쪽지가 있는지 여부를 확인하여 쪽지를 받도록 하였음. <br>하지만 서버측에서 전송할 정보가 없음에도  클라이언트 측에서 지속적으로 request를 보내는 문제가 발생.
> * SSE(Server-Sent Events): 서버에서 클라이언트로 실시간으로 데이터를 전송하는 기술로, 클라이언트에서 서버로 요청을 보내고 서버에서 클라이언트로 데이터를 보내는 방식으로 구현.<br> 이를 통해 서버에서 새로운 쪽지가 있을 때 클라이언트로 알림을 주는 방식으로 변경.<br> 단방향 프로토콜을 사용하기에 Polling 방식보다 서버에 부하를 덜 주는 방식으로 변경.
> 
> ---
> 
> #### 3. **채팅**
> 채팅을 구현하는 과정에서 Polling 방식과 SSE 방식은 실시간의 양방향 통신을 위한 방법이 아니라는 것을 깨달음. 그래서 WebSocket을 사용하여 실시간 양방향 통신을 구현.
> * WebSocket: HTTP 프로토콜을 사용하는 웹페이지에서 서버와 실시간으로 양방향 통신을 할 수 있도록 하는 기술로, 클라이언트와 서버가 지속적으로 연결을 유지하고 있어야 하기 때문에 Polling 방식이나 SSE 방식보다 서버에 부하를 더 주는 방식이지만, 실시간 양방향 통신을 위한 방법으로 채택.<br> Java를 사용하기에 SockJs와 Stomp를 사용하여 WebSocket을 구현.
> 
> ---
> 
> #### 4. **복잡한 쿼리**
> 사용자가 검색 조건 필터링을 통해 원하는 정보를 찾을 수 있도록 하기 위해 복잡한 쿼리를 작성해야 했음. 그런데 join을 하는 횟수가 많아 지기에 N+1 문제가 발생. 이를 해결하기 위해 fetch join을 사용하여 한 번에 모든 데이터를 가져오도록 함. 그런데 또 거기에서 발생하는 대용량 데이터를 가져오는 데 시간이 지나치게 오래 걸림. 그에 따른 해결책으로 Batch Size를 설정하여 한 번에 가져오는 데이터의 양을 조절하여 성능을 향상시킴.
> * Batch Size: ```@BatchSize(size = 1000)```를 사용하여 한 번에 가져오는 데이터의 양을 조절하여 성능을 향상시킴.

> ### 🌱 회고
> 
> ---
> 
> ### 👤 조원우
> 
> ---
> 
> ### **첫 프로젝트**
> * 첫 프로젝트를 해보면서 생각보다 신경 쓸 게 많았습니다. 코드만 잘 짜면 되는 것이라고 생각했는데, 그보다 더 중요한 부분이 협업에서의 소통 능력과 기획이라는 것을 깨닫게 되었습니다.
> * 프로젝트를 통해 몸으로 부딪히며 모호하게 생각했던 개념들이 점점 정립된다는 것을 느꼈습니다. 다양한 프로젝트를 통해 이 경험을 더욱 늘리고 싶다는 생각을 하게 되었습니다.
> 
> ### ***스프링 부트***
> * 순수 서블릿으로 개발하였던 이전의 프로젝트에서 스프링 부트를 사용해보니, 개발자들이 정말 꾸준히 노력하고 있음을 느꼈습니다. 저도 이처럼 개발 생태계에 기여할 수 있는 개발자로 성장하고 싶다는 목표를 가지게 되었습니다.
> 
> ---
> 
> ### **발전한 점**
> 
> #### **Git**
> - **브랜치 전략**
>     - 이전의 프로젝트에서는 팀원 모두 GitHub를 통한 협업 경험이 없어 처음에는 우여곡절이 많았습니다. 그때의 시행착오를 바탕으로 이번 프로젝트에서는 브랜치 전략을 더 확실히 가져갈 수 있었습니다.
>     - 이전의 프로젝트에서는 개인별로 브랜치를 생성했다면, 이번 프로젝트에서는 `main - dev - feature` 브랜치로 기능별로 관리하여 프로젝트의 진행 상황을 파악하기 더 용이했습니다.
> 
> - **이슈 관리**
>     - GitHub 이슈를 통한 프로젝트 관리 경험을 통해 GitHub 사용에 익숙해졌고, 협업 툴의 중요성도 배웠습니다.
>     - 이슈 관리를 통해 팀원 간의 작업 진행 상황을 더 잘 공유할 수 있었고, 작업 내용을 소통하는 데 매우 유용했습니다.
> 
> - **PR**
>     - 이전의 프로젝트에서는 PR 내용을 간소하게 작성했지만, 이번 프로젝트에서는 구체적이고 상세하게 작성하려고 노력했습니다. 이로 인해 팀원들이 제 코드를 쉽게 이해하고, 진행 상황을 더 정확히 전달할 수 있었습니다.
> 
> #### **다양한 기술 사용**
> - **기술 스택 확장**
>     - 이전의 프로젝트에서는 순수 자바(서블릿)와 관계형 데이터베이스(MyBatis)를 사용했지만, 이번 프로젝트에서는 스프링 부트를 도입하고 `Spring JPA`, `QueryDSL`, `Spring Security`, `Stomp`와 같은 다양한 기술을 사용하며 이해도를 높일 수 있었습니다.
>     - `Polling`, `SSE`, `Socket`과 같은 다양한 프로토콜을 경험하면서 각각의 장단점을 파악하고, 그에 대한 이해도를 높일 수 있었습니다.
> 
> #### **배포 경험**
> - **AWS EC2 배포**
>     - 이전의 프로젝트에서는 로컬 환경에서만 구동했지만, 이번 프로젝트에서는 AWS EC2 인스턴스를 생성하고 도메인을 연결하고 HTTPS 환경을 구성하여 배포 경험을 쌓을 수 있었습니다.
> 
> ---
> 
> ### **아쉬웠던 점**
> 
> - **다중 서버 환경 미고려**
>     - 로드 밸런싱 등의 스케일 아웃을 통해 서버가 다중화되는 환경에서, SSE 방식, Socket 방식의 코드가 제대로 작동하지 않을 수 있다는 점을 미처 고려하지 못했습니다.
>     - 다음 프로젝트에서는 `Redis`, `RabbitMQ`, `AWS SQS`와 같은 메시지 큐를 사용하여 문제를 해결하고자 합니다.
> 
> - **CI/CD 경험 부족**
>     - 빌드와 배포 자동화 경험이 부족했습니다. 다음 프로젝트에서는 `Jenkins`, `GitHub Actions`, `Docker` 등을 활용하여 이에 대한 경험을 쌓고자 합니다.
> 
> - **프론트엔드 개발자의 부재**
>     - 백엔드 개발자들만 모인 프로젝트였기 때문에 프론트엔드 개발이 더디게 진행되었고, 상대적으로 백엔드에 집중할 시간이 줄어들었습니다.
>     - 다음에는 RESTful API를 더 철저하게 설계하고, 클라이언트와 서버를 분리해 더욱 완성도 있는 결과물을 만들어 보고 싶습니다.
> 
> - **초기 설계 미흡**
>     - 초기 설계가 부족해 프로젝트 중간에 변경 사항이 자주 발생하여 팀원들이 불편을 겪었습니다. 초기부터 예외 상황에 대해 더 세밀하게 설계했다면 좋았을 것이라는 아쉬움이 남습니다.

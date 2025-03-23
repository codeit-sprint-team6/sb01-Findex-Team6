# 📈 프로젝트 소개

- Java Spring과 외부 API를 이용한 금융 지수 데이터를 한눈에 제공하는 대시보드 서비스
- 프로젝트 기간: 2025.03.13 ~ 2025.03.24

## 🧑‍💻 팀원 구성

|                  김응진                  |                     이민주                     |                      이원길                      |                      이주녕                      |                     허원재                     |
| :--------------------------------------: | :--------------------------------------------: | :----------------------------------------------: | :----------------------------------------------: | :--------------------------------------------: |
|<img width="160px" src="https://avatars.githubusercontent.com/u/138095131?v=4"/>|<img width="160px" src="https://github.com/user-attachments/assets/a7781d01-fea9-4454-97e7-c7c51415f283"/>|<img width="160px" src="https://github.com/user-attachments/assets/5266f84b-8020-427a-8daf-bc2a63456ff6"/>|<img width="160px" src="https://avatars.githubusercontent.com/u/139120379?v=4"/>|<img width="160px" src="https://avatars.githubusercontent.com/u/39307905?v=4"/>|
| [@mmm806](https://github.com/mmm806) | [@m0276](https://github.com/m0276) | [@realitsyourman](https://github.com/realitsyourman) | [@JunyungLee](https://github.com/JunyungLee) | [@Oince](https://github.com/Oince) |
------

## 🔧 기술 스택

<h2 align="center">✨Backend</h2>

<div align="center">
	<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
    <img src="https://img.shields.io/badge/spring data jpa-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
    <img src="https://img.shields.io/badge/java-000000?style=for-the-badge&logo=openjdk&logoColor=white">
    <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
</div>


<h2 align="center">📦️Database</h2>

<div align="center">
	<img src="https://img.shields.io/badge/PostgresQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white">
</div>

<h2 align="center">🔨Tools</h2>

<div align="center">
	<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white">
	<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white">
    <img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">
    <img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
</div>


------

## 📝 팀원별 구현 기능 상세

### 김응진

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

### 이민주

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 지수 정보를 저장합니다.
	- ![저장](https://github.com/user-attachments/assets/b0f543ba-e46b-4691-b250-6db6384ef852)

- 지수 정보를 수정합니다.
	- ![수정](https://github.com/user-attachments/assets/7db63c51-3a48-4321-bccb-8424aeb3b4a9)

- 지수 정보를 삭제합니다.
	- ![삭제](https://github.com/user-attachments/assets/03a78609-b924-4d15-b8f8-f87c2ed9473a)



### 이원길
- 지수 정보 연동
  - ![지수정보연동](https://github.com/user-attachments/assets/8812b621-bd4b-4d9a-adcb-ad2db7a3ba9d)
  - 공공데이터포털의 Open API를 이용해 주가 지수 정보를 가져옵니다.

- 지수 데이터 연동
  - ![지수데이터연동](https://github.com/user-attachments/assets/69afc93e-a246-43b5-8c4e-287bab6e1fc5)
  - 선택한 지수의 시가, 고가, 저가 같은 데이터를 Open API를 통해 가져옵니다.

- 연동 목록 조회
  - ![목록조회1](https://github.com/user-attachments/assets/c17fc55e-240b-47f7-8095-afc59e1184e8)
  - ![목록조회2](https://github.com/user-attachments/assets/bc29bbf2-a53c-4e04-9edc-3b194006e708)
  - ![목록조회3](https://github.com/user-attachments/assets/138cea04-a00f-4a50-bcbd-2108c70a463b)
  - 지수 정보와 데이터를 연동한 기록을 조회할 수 있습니다.
  - 커서 페이지네이션을 지원합니다.
 
- 자동 연동 설정
  - ![자동연동설정수정](https://github.com/user-attachments/assets/6783b162-1a04-4eb8-91c9-67dd19ec7768)
  - 지수 데이터를 자정 12시에 자동으로 연동할 수 있게 설정할 수 있습니다.
 
- 자동 연동 목록 조회
  - ![자동 연동목록조회](https://github.com/user-attachments/assets/8c87ec94-dd72-4e5c-98f2-b7c7f691ec52)
  - 자동으로 연동할 지수 목록을 조회할 수 있습니다.
  - 커서 페이지네이션을 지원합니다.



### 이주녕

- 지수 차트 조회
  - 사용자가 조회 기간을 선택하면 해당 기간동안의 지수 데이터를 조회 후, 차트에서 보여줄 이동평균을 계산합니다. 
  1. 시작/종료 날짜를 계산 후, 지수 정보와 데이터를 조회합니다. 
  2. 조회한 데이터를 객체 리스트로 변환 후, 이동평균(Moving Average)을 계산합니다. 
     - 최근 5일간의 평균 계산합니다 : MA5
     - 최근 20일간의 평균 계산합니다 : MA20
  3. 최종적으로 객체를 생성하여 반환합니다.


<img width="1303" alt="차트조회 2025-03-23 오후 10 42 03" src="https://github.com/user-attachments/assets/ce0603d1-a32f-4028-860b-8cfa02e0852d" />


- 관심지수 성과 조회 
  - 즐겨찾기(favorite) 설정 한 지수들에 대해 특정 기간동안의 성과를 계산해서 반환하는 기능입니다.
<img width="1159" alt="즐겨찾기 지수조회 2025-03-23 오후 10 20 39" src="https://github.com/user-attachments/assets/892ed9ff-a63c-483f-aa87-37f7ed50d88b" />


- 지수 성과 랭킹조회
  - 특정 기간 동안 지수의 성과 계산 > 순위를 매김
  - 해당 기간 동안의 각 지수의 성과 (상승률, 하락률)를 계산합니다.
  - 모든 지수에 대해 성과를 비교해 내림차순 정렬 후, 순위를 매깁니다. 
  - 사용자가 특정 indexInfoId를 입력하면 해당 지수의 순위만을 반환할 수 있습니다.
  

https://github.com/user-attachments/assets/bca6cfaf-fc06-4644-8ada-92ff383b61b2


- 지수 데이터 CSV export > openCSV 방식 활용
  - PrintWriter를 이용해 응답 response의 출력 스트림을 가져옵니다. 
  - CSVWriter(OpenCSV)를 사용해 CSV 파일을 생성합니다. 
  - 리스트를 순회하며 각 데이터를 CSV의 형식으로 변환하여 저장합니다.
<img width="1403" alt="export 2025-03-23 오후 10 30 02" src="https://github.com/user-attachments/assets/3ce1950e-b964-4c27-bae6-a9f15aacc4ab" />
<img width="337" alt="download 2025-03-23 오후 10 30 23" src="https://github.com/user-attachments/assets/6f403dbf-a8ac-4732-bc8e-23b2588febcb" />
<img width="687" alt="csvFile 2025-03-23 오후 10 30 45" src="https://github.com/user-attachments/assets/164e79b2-408f-4038-b770-cbb07800c4dd" />



### 허원재

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

------

## 🗃️ 파일 구조

```plaintext
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┣ com
 ┃ ┃ ┃ ┣ sprint
 ┃ ┃ ┃ ┃ ┣ findex_team6
 ┃ ┃ ┃ ┃ ┃ ┣ batch
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ BatchAutoSyncIndexData.java
 ┃ ┃ ┃ ┃ ┃ ┣ config
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ QueryDSLConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ RestTemplateConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SwaggerConfig.java
 ┃ ┃ ┃ ┃ ┃ ┣ controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobsController.java
 ┃ ┃ ┃ ┃ ┃ ┣ dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ dashboard
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ ChartDataPoint.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexChartDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexPerformanceDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValCsvDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ RankedIndexPerformanceDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ request
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigCursorPageRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataQueryRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataSortField.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataSyncRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoQueryRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexSortField.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ SortDirection.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ response
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseIndexInfoDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseSyncDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseSyncJobDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ ErrorResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseSyncJobDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ DashboardDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoSummaryDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobDto.java
 ┃ ┃ ┃ ┃ ┃ ┣ entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegration.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ ContentType.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ Dashboard.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ Index.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLink.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexVal.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SourceType.java
 ┃ ┃ ┃ ┃ ┃ ┣ error
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CustomException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ ErrorCode.java
 ┃ ┃ ┃ ┃ ┃ ┣ exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ syncjobs
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ DuplicateIndexException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ FailedCallOpenApiException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ NotFoundIndeValException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ NotFoundIndexException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ NotFoundItemException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncDataJobsServiceExceptionHandler.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncFailedException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobErrorCode.java
 ┃ ┃ ┃ ┃ ┃ ┃ GlobalExceptionHandler.java
 ┃ ┃ ┃ ┃ ┃ ┃ NotFoundException.java
 ┃ ┃ ┃ ┃ ┃ ┣ mapper
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDateLinkMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValMapperHelper.java
 ┃ ┃ ┃ ┃ ┃ ┣ repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationQuerydslRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationRepositoryImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ DashboardRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLinkRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLinkRepositoryImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLinkRepositoryQuerydsl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ service
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ util
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobUtils.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncDataJobsService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncInfoJobsService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobsSearchService.java
 ┃ ┃ ┃ ┃ ┃ ┣ FindexTeam6Application.java
 ┃ ┣ resources
 ┃ ┃ ┣ application.yml
 ┃ ┃ ┣ schema.sql
 ┃ ┃ ┗ static
 ┃ ┃ ┃ ┣ css
 ┃ ┃ ┃ ┃ ┗ style.css
 ┃ ┃ ┃ ┣ js
 ┃ ┃ ┃ ┃ ┗ script.js
 ┣ test
 ┃ ┣ java
 ┃ ┃ ┣ com
 ┃ ┃ ┃ ┣ sprint
 ┃ ┃ ┃ ┃ ┣ findex_team6
 ┃ ┃ ┃ ┃ ┃ ┗ FindexTeam6ApplicationTests.java
 ┣ .gitignore
 ┗ README.md
```

------

## 🌐 구현 홈페이지

https://findex.realits.me/

------

## 📄 프로젝트 회고록

(제작한 발표자료 링크 혹은 첨부파일 첨부)

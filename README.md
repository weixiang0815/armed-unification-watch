# 🛰️ 武統觀察站 Armed Unification Watch

> 一個由民間主導、專注監督支持中共以武力侵略台灣的公開言論的平台。

---

## 📌 專案宗旨

武統觀察站致力於揭露、紀錄並分析支持「中共武力統一台灣」的公眾言論，包含：

- 網紅與意見領袖在公開平台的發言紀錄
- 經社群目擊回報的片段與上下文
- 對應國籍／身分別的合法因應建議

我們強調資料來源公開、查證可回溯、不任意標籤，僅針對「公開支持中國武裝侵略台灣」之具體言論進行揭露與追蹤。

---

## 🏗️ 系統架構

- **前端**：Angular + ngx-translate（支援多語系介面）
- **後端**：Spring Boot + PostgreSQL
- **AI 模組**：語意分類 / Whisper 語音辨識（可選）
- **多語系支援**：內建 zh-TW / en / zh-CN，可擴充任意語言
- **部署建議**：Docker + Nginx（未來支援雲端部署）

---

## 📂 專案結構總覽

```bash
armed-unification-watch/
├── frontend/       # Angular SPA
├── backend/        # Spring Boot RESTful API
├── database/       # SQL schema and migration scripts
├── docs/           # 系統與開發文件
├── README.md
└── LICENSE
```

---

## 🚀 快速開始

### ✅ 前端啟動（Angular）

```bash
cd frontend
npm install
ng serve
```

### ✅ 後端啟動（Spring Boot）

```bash
cd backend
./mvnw spring-boot:run
```

### ✅ PostgreSQL 資料庫初始化

```bash
psql -U your_user -d your_db -f database/init.sql
```

---

## 🌐 官方語言支援

| 語言              | 狀態                |
| ----------------- | ------------------- |
| 繁體中文（zh-TW） | ✅ 預設語系         |
| 英文（en）        | ✅ 已實作           |
| 簡體中文（zh-CN） | ✅ 已實作           |
| 其他語言          | 🔜 可由社群翻譯擴充 |

---

## 🤝 貢獻指南

1. Fork 本專案
1. 建立分支：`git checkout -b feature/your-feature`
1. 提交變更：`git commit -m 'add your feature'`
1. 推送到分支：`git push origin feature/your-feature`
1. 發起 Pull Request

如有任何爭議或誤判案例，請使用 [Issue 回報區](https://github.com/weixiang0815/armed-unification-watch/issues)。

---

## 📄 授權條款

本專案以 MIT License 發布，歡迎使用、改作與協作。

---

## ✊ 團結守護台灣民主，讓認知作戰無所遁形

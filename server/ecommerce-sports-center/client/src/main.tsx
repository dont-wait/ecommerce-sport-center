import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './app/layout/index.css'
import App from './app/layout/App.tsx'
import { ToastProvider } from './contexts/ToastProvider.tsx'

createRoot(document.getElementById('root')!).render(
  <ToastProvider>
    <StrictMode>
      <App />
    </StrictMode>
  </ToastProvider>,
)

import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './app/layout/index.css'
import App from './app/layout/App.tsx'
import { ToastProvider } from './contexts/ToastProvider.tsx'
import '@fontsource/roboto/300.css';
import '@fontsource/roboto/400.css';
import '@fontsource/roboto/500.css';
import '@fontsource/roboto/700.css';


createRoot(document.getElementById('root')!).render(
  <ToastProvider>
    <StrictMode>
      <App />
    </StrictMode>
  </ToastProvider>,
)

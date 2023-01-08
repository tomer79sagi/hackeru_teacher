import React from 'react';
import MainContent from './MainContent';
import "./PageMain.css";
import Clock from './__clock';

const PageMain = () => {
    return ( 
        <main className="holy-grail__main">
            {/* Left sidebar */}
            <aside className="holy-grail__left">LEFT</aside>

            {/* Main content - MainContent / Class Component */}
            <MainContent/>

            {/* Right sidebar */}
            <nav className="holy-grail__right">
                <Clock/>
            </nav>
        </main>
     );
}
 
export default PageMain;
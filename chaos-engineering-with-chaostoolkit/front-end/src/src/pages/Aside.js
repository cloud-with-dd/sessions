import React from "react";
import {
  ProSidebar,
  SidebarHeader,
  SidebarContent,
  SidebarFooter
} from "react-pro-sidebar";

import { Link, useMatch, useResolvedPath } from "react-router-dom"

export default function Aside() {
  const headerStyle = {
    padding: "24px",
    textTransform: "uppercase",
    fontWeight: "bold",
    letterSpacing: "1px",
    overflow: "hidden",
    textOverflow: "ellipsis",
    whiteSpace: "noWrap",
    textAlign: "center"
  };

  return (
    <ProSidebar>
      <SidebarHeader style={headerStyle}>Web App</SidebarHeader>
      <SidebarContent>
        <nav className="nav">
      <ul>
      <CustomLink to="/continents">Continents</CustomLink>
      <CustomLink to="/countries">Countries</CustomLink>
      <CustomLink to="/cities">Cities</CustomLink>
      <CustomLink to="/towns">Towns</CustomLink>
      </ul>

    </nav>
        
      </SidebarContent>
      <SidebarFooter style={{ textAlign: "center" }}>
        
      </SidebarFooter>
    </ProSidebar>
  );
}


function CustomLink({ to, children, ...props }) {
  const resolvedPath = useResolvedPath(to)
  const isActive = useMatch({ path: resolvedPath.pathname, end: true })

  return (
    <li className={isActive ? "active" : ""}>
      <Link to={to} {...props}>
        {children}
      </Link>
    </li>
  )
}